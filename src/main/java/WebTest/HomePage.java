package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

// class home page for homepage methods
public class HomePage extends Utils
{
    //to verify user is on homepage
    public void userIsOnHomePage()
    {
        assertURL( "https://demo.nopcommerce.com/" );
    }
    // method to click on categories
    public void userClicksOnLinkFromTopMenu(String category)
    {
        driver.findElement( By.linkText( category ) ).click();
    }
    // method to hoover over category
    public void hooverOverCategoryLink(String category)
    {
        WebElement link_category = driver.findElement( By.linkText( category) ) ;
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement( link_category ).build();
        mouseOverCategory.perform();
    }
    // method to click on subcategory link
    public void clickOnSubcategoryLink(String subcategory)
    {
        clickOnElement( By.linkText( subcategory ) );
    }
    // verify user should be able to navigate to subcategory
    public void userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(String subcategory)
    {
        assertURL( subcategory);
    }
}
