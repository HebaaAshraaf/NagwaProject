Feature: Search
  Scenario: Search about "addition" and check the questions number
    Given The user opens Nagwa Website
    And choose the English language
    When the user tries to search about "addition"
    And the user chooses the second search result
    And the user go to the worksheet homepage
    Then the Questions appears is "10"