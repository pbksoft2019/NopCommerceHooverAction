package WebTest;

import org.junit.Assert;
import org.openqa.selenium.By;

// class util created to keep reusable methods
public class Utils extends BasePage
{

    // method for verify URL
    public static void assertURL(String text)
    {
        Assert.assertTrue( driver.getCurrentUrl().contains( text ) );
    }
    // method to click on element
    public static void clickOnElement(By by)
    {
        driver.findElement( by ).click();
    }
    // method to get text from elements
    public static String getTextElement(By by)
    {
        String get_text = driver.findElement( by ).getText();
        return get_text;
    }
}
