Feature: Lingo trainer
  As a Lingo trainer,
  I want to challenge users,
  In order to make them better in Lingo.

  Scenario: Start new game
    When I guess a "word"
    Then I should see the whole "word"(result)

    Scenario Outline: Guessing a word
      Given I am thinking about some words
      When I start guessing some words
      Then I see some letters from the words
      And I get feedback if the word i guess is correct

      Examples:
      | Word | Guess | Feedback|
      | dog  | doc   | d o .  |
      | dog  | dog   | dog     |

      Examples:
        | Word | Guess | Feedback|
        | word | wore  | w o r . |
        | word | word  | word    |

      Examples:
        | Word     | Guess     | Feedback|
        | examples | exercise  | ex......|
        | examples | exahertz  | exa.....|
        | examples | explorer  | ex....e.|
        | examples | explores  | ex....es|
        | examples | examples  | examples|


      #failure path
      Given I am guessing words
      And the words were incorrect
      Then I lost the game

      Examples:
        | Word     | Guess     | Feedback|
        | examples | exercise  | ex......|
        | examples | exahertz  | exa.....|
        | examples | explorer  | ex....e.|
        | examples | explores  | ex....es|
        | examples | expended  | ex....e., you lost|
