package uk.barclays.co.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.barclays.co.pages.HomePage;
import uk.barclays.co.testbase.TestBase;

/**
 * Created by Ankita
 */
public class LoginTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
    }
}
