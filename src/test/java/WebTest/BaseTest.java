package WebTest;


import org.junit.After;
import org.junit.Before;

public class BaseTest extends Utils
{
    //object created for BrowserSelector class
    BrowserSelector browserSelector = new BrowserSelector();

    // method to run at the start of every test case
    @Before
    public void setBrowserSelector()
    {
        browserSelector.setUpBrowser();
    }

    // method to run at the end of each test case
    @After
    public void closeBrowser()
    {
        browserSelector.closeBrowser();
    }
}
