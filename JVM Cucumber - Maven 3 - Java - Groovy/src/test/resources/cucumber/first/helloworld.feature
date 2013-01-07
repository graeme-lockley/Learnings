Feature: Greet World

  Scenario: Say hello
    Given I have a greeting app with "Howdy"
    When I ask it to say greet
    Then it should answer with "Howdy World"

  Scenario: Say cheerio
   Given I have a greeting app with "Cheerio"
    When I ask it to say greet
    Then it should answer with "Cheerio World"
