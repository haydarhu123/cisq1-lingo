Feature: Lingo trainer
  As a Lingo trainer,
  I want to challenge users,
  In order to make them better in Lingo.

  Scenario: Start new game
    When I guess a "word"
    Then I should see the whole "word"(result)
