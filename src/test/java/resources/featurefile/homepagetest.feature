Feature: Top Menu Test
  As a user I want to navigate the virgin games website Top Menu Bar

  @Regression
  Scenario: I should navigate to the Free Games Tab
    Given I am on the homepage
    And I click accept cookies
    And I click on "<Free Games>" tab
    Then I should verify the page should contain the text "Experience a Selection of Free Games"