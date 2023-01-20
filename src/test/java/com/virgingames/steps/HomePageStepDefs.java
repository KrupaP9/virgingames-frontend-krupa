package com.virgingames.steps;

import com.virgingames.pages.FreeGamesPage;
import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;

public class HomePageStepDefs {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    @And("^I click accept cookies$")
    public void iClickAcceptCookies() {
        new HomePage().clickAcceptCookies();
    }

    @And("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String menu)throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickFreeGamesTab();
    }

    @And("^I should verify the page should contain the text \"([^\"]*)\"$")
    public void iVerifyThePageTitleShouldBe(String text) {
        Assert.assertEquals(text,new FreeGamesPage().getFreeGamesText(),"Free Games Text Not Displayed");
    }
}
