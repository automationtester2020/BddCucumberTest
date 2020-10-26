package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseTest {

    WebDriver driver;

//    @FindBy(className = "ico-login") public WebElement loginlink;
    @FindBy(id= "Email") public WebElement enterEmail;
    @FindBy(id= "Password") public WebElement enterPassword;
    @FindBy(className = "login-button") public WebElement loginBtn;

    public LogInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    //  public void clickLogInLink()
 //   {
 //   loginlink.click();
 //    }

    public void enterEmailText(String Em)
    {
        enterEmail.sendKeys(Em);
    }

    public void enterPwdtext(String pwd)
    {
        enterPassword.sendKeys(pwd);
    }

    public void clickLogInBtn()
    {
        loginBtn.click();
    }

}