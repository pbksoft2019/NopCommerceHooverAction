package WebTest;

import io.cucumber.java.Before;
import org.junit.After;

public class Hooks extends Utils
{
    // object created for browserSelector page
    BrowserSelector browserSelector = new BrowserSelector();

    // method to run at the start of every
    @Before
    // method to open browser
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
    }

    // method to run after every test case
    @After
    // method to close browser after each test case
    public void closeBrowser()
    {
        driver.quit();
    }
}
