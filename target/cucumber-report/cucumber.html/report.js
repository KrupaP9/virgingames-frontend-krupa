$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepagetest.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "As a user I want to navigate the virgin games website Top Menu Bar",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8288849200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I should navigate to the Free Games Tab",
  "description": "",
  "id": "top-menu-test;i-should-navigate-to-the-free-games-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click accept cookies",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on \"\u003cFree Games\u003e\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should verify the page should contain the text \"Experience a Selection of Free Games\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 289963100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.iClickAcceptCookies()"
});
formatter.result({
  "duration": 216814600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cFree Games\u003e",
      "offset": 12
    }
  ],
  "location": "HomePageStepDefs.iClickOnTab(String)"
});
formatter.result({
  "duration": 1361277500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Experience a Selection of Free Games",
      "offset": 50
    }
  ],
  "location": "HomePageStepDefs.iVerifyThePageTitleShouldBe(String)"
});
formatter.result({
  "duration": 274062000,
  "status": "passed"
});
formatter.after({
  "duration": 2378652100,
  "status": "passed"
});
});