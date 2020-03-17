package WebTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

// browserSelector class for setting up and closing browser
public class BrowserSelector extends Utils
{
    // method to open browser
    public  void setUpBrowser()
    {
        // object created for LoadProp
        LoadProp loadProp = new LoadProp();
        // getting browser name from data file
        String browser = loadProp.getProperty( "browser" );

        // path and properties for chrome browser
        if (browser.equalsIgnoreCase( "chrome" ))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
            driver= new ChromeDriver();
            // driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get( loadProp.getProperty( "url" ) );
        }
        // path and properties for firefox
        else  if  (browser.equalsIgnoreCase( "firefox" ))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/Resources/BrowserDriver/geckodriver.exe");
            driver= new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            // driver.get("https://demo.nopcommerce.com/");
            driver.get( loadProp.getProperty( "url" ) );
        }
        // path and properties for internet explorer
        else  if  (browser.equalsIgnoreCase( "ie" ))
        {
            System.setProperty("webdriver.ie.driver", "src/test/Resources/BrowserDriver/IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
            ieCapabilities.setCapability("disable-popup-blocking", true);
            ieCapabilities.setCapability("enablePersistentHover", true);

            driver = new InternetExplorerDriver(ieCapabilities);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get( loadProp.getProperty( "url" ) );
        }
        else
        {
            // message to display if user enter wrong browser name or empty
            System.out.println("Browser name is wrong or empty :"+browser);
        }
    }

}
