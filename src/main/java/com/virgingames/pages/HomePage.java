package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]" )
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Free Games')]" )
    WebElement freeGamesTab;
    @CacheLookup
    @FindBy(xpath = "//div[@id='styledApp']/div[1]/div[1]/ul[1]/li" )
    List<WebElement> headerMenu;
    public void clickAcceptCookies(){
        log.info("Clicking on accept cookies ");
        clickOnElement(acceptCookies);
    }
    public void clickFreeGamesTab(){
        log.info("Clicking on free games tab"+freeGamesTab.toString());
        clickOnElement(freeGamesTab);
    }


}
