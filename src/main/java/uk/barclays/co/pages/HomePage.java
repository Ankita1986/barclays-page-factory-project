package uk.barclays.co.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.barclays.co.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(linkText = "Log In")
    WebElement _loginLink;

    @FindBy(linkText = "Register")
    WebElement _registerLink;

    @FindBy(linkText = "Mortgage")
    WebElement _mortgageLink;

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link" + _loginLink.toString());
    }
    public void clickOnRegisterLink(){
        Reporter.log("Clicking on register link "+ _registerLink.toString()+ "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register link" + _registerLink.toString());
    }
    public void clickOnMortgageLink(){
        clickOnElement(_mortgageLink);
    }
}
