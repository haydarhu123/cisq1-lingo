package nl.hu.cisq1.lingo.trainer.domain;

import nl.hu.cisq1.lingo.trainer.domain.Feedback;
import nl.hu.cisq1.lingo.trainer.domain.Mark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {

    @Test
    @DisplayName("You have guessed the word if all letters are correct!")
    void wordIsGuessed(){

        String attempt = "WOORD";
        List<Mark> marks = List.of(Mark.CORRECT, Mark.CORRECT, Mark.CORRECT, Mark.CORRECT, Mark.CORRECT);
        Feedback feedback = new Feedback(attempt , marks);

        assertTrue(feedback.wordIsGuessed());
    }

    @Test
    @DisplayName("Word is not guessed! Try Again!")
    void wordIsNotGuessed(){

        String attempt = "WOORD";
        List<Mark> marks = List.of(Mark.PRESENT, Mark.ABSENT, Mark.PRESENT, Mark.PRESENT, Mark.ABSENT);
        Feedback feedback = new Feedback(attempt , marks);

        assertFalse(feedback.wordIsGuessed());

    }

    @Test
    @DisplayName("The word you try is invalid!")
    void guessIsInvalid() {

        String attempt = "WOORD";
        List<Mark> marks = List.of(Mark.INVALID, Mark.INVALID, Mark.INVALID, Mark.INVALID, Mark.INVALID);
        Feedback feedback = new Feedback(attempt , marks);

        assertTrue(feedback.guessIsInvalid());
    }

    @Test
    @DisplayName("The word is valid!")
    void guessIsNotInvalid() {

        String attempt = "WOORD";
        List<Mark> marks = List.of(Mark.PRESENT, Mark.ABSENT, Mark.PRESENT, Mark.PRESENT, Mark.ABSENT);
        Feedback feedback = new Feedback(attempt , marks);

        assertFalse(feedback.guessIsInvalid());

    }
}