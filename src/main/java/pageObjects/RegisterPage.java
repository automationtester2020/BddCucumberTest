package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseTest
{

WebDriver driver;
    @FindBy(id="gender-male") public WebElement maleRadioBtn;
    @FindBy(id="gender-female") public WebElement FemaleRadioBtn;
    @FindBy(id="FirstName") public WebElement firstNameTextBox;
    @FindBy(id="LastName") public WebElement lastNameTextBox;
    @FindBy(id="Email") public WebElement emailTextBox;
    @FindBy(id="Password") public WebElement passwordTextBox;
    @FindBy(id="ConfirmPassword") public WebElement confirmPasswordTextBox;
    @FindBy(id="register-button") public WebElement registerBtn;
    @FindBy(name = "DateOfBirthDay") public WebElement dobDropdown;
    @FindBy(name = "DateOfBirthMonth" ) public WebElement monthDropdown;
    @FindBy(name = "DateOfBirthYear") public WebElement yearDropdown;
    @FindBy(css = "div.result") public WebElement registrationConfMsg;


    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }
    public void clickFemaleRadioBtn()
    {
        FemaleRadioBtn.click();
    }
    public void enterFirstNametext(String enterFN)
    {
        firstNameTextBox.sendKeys(enterFN);
    }
    public void enterLastNametext(String enterLN)
    {
        lastNameTextBox.sendKeys(enterLN);
    }
    public void enterEmail(String enterEmail)
    {
        emailTextBox.sendKeys(enterEmail);
    }
    public void enterPassword(String enterPwd)
    {
        passwordTextBox.sendKeys(enterPwd);
    }
    public void enterConfirmPassword(String enterConfPwd)
    {
        confirmPasswordTextBox.sendKeys(enterConfPwd);
    }
    public void clickRegisterBtn()
    {
        registerBtn.click();
    }

    public void selectDateOfBirth()
    {
        Select date = new Select(dobDropdown);
        date.selectByIndex(15);
    }
    public void selectMonthOfBirth()
    {
        Select month = new Select(monthDropdown);
        month.selectByValue("6");
    }
    public void selectYearOfBirth()
    {
        Select year = new Select(yearDropdown);
        year.selectByValue("1980");
    }

    public String getregistrationConfMsg()
    {
        return registrationConfMsg.getText();
    }



}
