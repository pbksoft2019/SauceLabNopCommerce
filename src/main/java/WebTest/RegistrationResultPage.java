package WebTest;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
    // locator for actual registration successful message
    private By _registerSuccessMessage = By.className("result");
    // expected registration success message
    String expected = "Your registration completed";

    // assert method for registration test case
    public void verifyUserSeeRegistrationSuccessMessage()
    {
        //assertURL( "registerresult" );
        assertTextMessage( "Registration not successful...", expected, _registerSuccessMessage );
    }
}
