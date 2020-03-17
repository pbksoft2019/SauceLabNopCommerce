package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    // time stamp method
    public static String timeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat( "ddmmyyhhmmss" );
        Date date = new Date();
        return (dateFormat.format( date ));
    }

    // reusable method for click on element
    public static void clickOnElement(By by)
    {
        driver.findElement( by ).click();
    }

    // method to get text from element
    private static String getTextFromElement(By by)
    {
        return driver.findElement( by ).getText();
    }

    // method for entering text input
    public void sendText(By by, String text)
    {
        driver.findElement( by ).sendKeys( text );
    }

    // method to compare expected and actual text
    public static void assertTextMessage(String message, String expected, By by)
    {
        String actual = getTextFromElement( by );
        Assert.assertEquals( message, expected, actual );
    }
    // method to assert url
    public static void assertURL(String text) {
        Assert.assertTrue( driver.getCurrentUrl().contains( text ) );
    }
    // method for wait in between 2 action
    public static void sleep(int time) {
        try
        {
            Thread.sleep( time * 1000 );
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
