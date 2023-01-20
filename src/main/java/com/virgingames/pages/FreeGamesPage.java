package com.virgingames.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.virgingames.browserfactory.ManageBrowser.driver;

public class FreeGamesPage {
    private static final Logger log = LogManager.getLogger(FreeGamesPage.class.getName());
    public FreeGamesPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Experience a Selection of Free Games')]" )
    WebElement freeGamesText;
    public String getFreeGamesText(){
        log.info("Getting text from : "+freeGamesText.toString());
        return freeGamesText.getText();
    }
}
