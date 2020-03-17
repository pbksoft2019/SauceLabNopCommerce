package WebTest;

import org.openqa.selenium.By;

public class HomePage extends  Utils
{
    // locator for register button
    private By _registerLink = By.className( "ico-register");

    // method for verify user is on home page
    public void verifyUserIsOnRegisterPage()
    {
        assertURL( "register" );
    }
    // method for click on register button
    public void clickOnRegisterButton(){
        clickOnElement( _registerLink );
    }
}
