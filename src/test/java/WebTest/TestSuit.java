package WebTest;

import org.junit.Test;

public class TestSuit extends BaseTest
{
    // object created for required class
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test
    // method for registration on NopCommerce website
    public  void UserShouldBeRegisterSuccessfully()
    {
        // using method from homepage to click on registration button
        homePage.clickOnRegisterButton();
        // using method from register page to enter registration details
        registrationPage.userEnterRegistrationDetails();
        // using method from registration result page to compare expected and actual result
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
}
