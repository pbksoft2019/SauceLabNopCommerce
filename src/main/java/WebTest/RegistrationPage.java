package WebTest;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    // locator for First name field
    private By _firstName = By.id( "FirstName" );
    // value for first name
    private String firstname = "james";
    // locator for last name field
    private By _lastName = By.id( "LastName" );
    // value for last name
    private String lastName = "bond";
    // location for email field
    private By _email = By.id("Email");
    // locator for password field
    private By _password = By.id( "Password" );
    // locator for confirm password field
    private By _confirmPassword = By.id( "ConfirmPassword" );
    // locator for register button
    private By _registerButton = By.id("register-button");
    // method for time stamp
    private static String timestamp = timeStamp();

    // method to verify user is on home page
    public void verifyUserIsOnRegisterPage()
    {
        assertURL( "register" );
    }

    // method to enter registration details
    public void userEnterRegistrationDetails()
    {
        sleep( 2);
        sendText( _firstName, firstname );
        sleep( 1 );
        sendText( _lastName, lastName );
        sleep( 1 );
        sendText( _email, "pbk"+timestamp+"@gmail.com" );
        sleep( 1 );
        sendText( _password, "Abcd1234" );
        sleep( 1 );
        sendText( _confirmPassword,"Abcd1234" );
        sleep( 1 );
        clickOnElement( _registerButton );
    }
}
