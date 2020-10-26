package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BaseTest
{
    WebDriver driver;
    @FindBy(xpath = "//a[@class='product-name']") public WebElement productNameHTC;
    @FindBy (xpath = "//span[@class='value-summary'][1]") public WebElement subTotalHCT1;
    @FindBy (xpath = "//span[text()='$0.00'][1]") public WebElement shippingHTC1;
    @FindBy (xpath = "(//span[text()='$0.00'])[2]") public WebElement taxHTC1;
    @FindBy (className = "qty-input") public WebElement numberOfItems;
    @FindBy (className = "qty-input") public WebElement updateNumberOfItems;
    @FindBy (xpath = "//input[@value='Update shopping cart']") public WebElement updateShoppingCart;
    @FindBy (xpath = "//span[@class='value-summary']") public WebElement subTotalHTC2;
    @FindBy (xpath = "//span[text()='$0.00'][1]") public WebElement shippingHTC2;
    @FindBy (xpath = "(//span[text()='$0.00'])[2]") public WebElement taxHTC2;

    public ShoppingCartPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String getTextProductHTC()
    {
        return productNameHTC.getText();
    }

    public String getSubtotalValueHTC1()
    {
        return subTotalHCT1.getText();

    }

    public String getShippingValueHTC1()
    {
        return shippingHTC1.getText();
    }

    public String getTaxValueHTC1()
    {
        return taxHTC1.getText();
    }

    public void getnumberofItemsinbox()
    {
        numberOfItems.clear();
    }
    public void updatenumberofItemsinbox(int quantity)
    {
         updateNumberOfItems.sendKeys("2");
    }

    public void shoppingCartLink()
    {
        updateShoppingCart.click();
    }

    public String getSubtotalValueHTC2()
    {
        return subTotalHTC2.getText();
    }

    public String getShippingValueHTC2()
    {
        return shippingHTC2.getText();
    }

    public String getTaxValueHTC2()
    {
        return taxHTC2.getText();
    }

}

