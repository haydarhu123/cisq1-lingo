package nl.hu.cisq1.lingo.trainer.domain;



import java.util.List;

public class Feedback {

    private String attempt;
    private List<Mark>marks;

    public Feedback(String attempt , List<Mark>marks) {
        this.attempt = attempt;
        this.marks = marks;
    }


    public boolean wordIsGuessed(){

        return marks.stream().allMatch(mark -> mark == Mark.CORRECT);
    }


    public boolean guessIsInvalid(){
        return marks.stream().allMatch(mark -> mark == Mark.INVALID);

    }
}
