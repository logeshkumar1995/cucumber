Feature: verify adactin login details

  Scenario Outline: a
    Given user is an adactin
    When user should enter "<username>" and "<password>"
    And user should enter login button

  Scenario Outline: b
    Given user is an adactin
    When user should enter "<username>" and "<password>"
    And user should enter login button

  Scenario Outline: c
    Given user is an adactin
    When user should enter "<username>" and "<password>"
    And user should enter login button

    Examples: 
      | username    | password   |
      | logeshkumar | logesh1234 |
      | logeshkumar | logesh1234 |
      | logeshkumar | logesh1234 |
