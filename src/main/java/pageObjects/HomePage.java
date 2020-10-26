package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseTest
{

    WebDriver driver;
    @FindBy (className = "ico-register") public WebElement registerLink;
    @FindBy (className = "ico-login") public WebElement loginLink;
    @FindBy (className = "ico-wishlist") public WebElement wishListLink;
    @FindBy (css = "a.ico-cart") public WebElement shoppingCartLink;
    @FindBy (id = "small-searchterms") public WebElement searchTextBox;
    @FindBy (xpath = "//input[@class='button-1 search-box-button']") public WebElement searchBtn;
    @FindBy(className="ico-logout") public WebElement logoutLink;

    //Add to Shopping Cart, Update from 1 item to 2 items, then print the values

    @FindBy (xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[3]") public WebElement addToCartHTC;
    @FindBy (xpath = "//a[text()='shopping cart']") public WebElement shoppingCartHTC;


    public HomePage(WebDriver driver)
    {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    }

    public void navigateToUrl(String urlBrowser) { driver.navigate().to(urlBrowser);}
    public void clickRegisterLink() { registerLink.click(); }
    public void clickLoginLink()
    {
        loginLink.click();
    }
    public void clickWishListLink()
    {
    wishListLink.click();
    }
    public void enterSearchTextBox(String searchText)
    {
        searchTextBox.sendKeys(searchText);
    }
    public void clickSearchBtn()
    {
        searchBtn.click();
    }
    public void clicklogoutLink()
    {
        logoutLink.click();
    }
    public boolean verify(){ return logoutLink.isDisplayed();}

    // Add to Shopping Cart methods

    public void clickAddtoCartHTC()
    {
        addToCartHTC.click();
    }
    public void clickShoppingCartlink()
    {
        shoppingCartHTC.click();
    }


}
