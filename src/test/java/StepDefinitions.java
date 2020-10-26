import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class StepDefinitions extends BaseTest
{
    WebDriver driver;

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url) throws MalformedURLException {
        setUp();
        homePage.navigateToUrl(url);
        System.out.println(getTitle());
    }

    @When("I click on login link from navbar")
    public void i_click_on_login_link_from_navbar()
    {
        homePage.clickLoginLink();
    }

    @Then("I should be able to navigate to log in page")
    public void i_should_be_able_to_navigate()
    {
        System.out.println(getTitle());
    }

    @When("I enter email {string}")
    public void i_enter_email(String email)
    {
        refresh();
        logIn.enterEmailText(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String pwd)
    {
        logIn.enterPwdtext(pwd);
    }

    @When("I click on log in button")
    public void i_click_on_log_in_button()
    {
        logIn.clickLogInBtn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
       boolean login = homePage.verify();
        System.out.println(login);
    }


    @When("I click on register link")
    public void i_click_on_register_link()
    {
        homePage.clickRegisterLink();
    }

    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        System.out.println(getTitle());
    }

    @When("I select gender")
    public void i_select_gender()
    {
        registerPage.clickFemaleRadioBtn();
    }

    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {
        refresh();
        registerPage.enterFirstNametext(dataTable.cell(1,0));
        registerPage.enterLastNametext(dataTable.cell(1,1));
        registerPage.enterEmail(dataTable.cell(1,2));
        registerPage.enterPassword(dataTable.cell(1,3));
        registerPage.enterConfirmPassword(dataTable.cell(1,4));

    }

    @When("I click on register button")
    public void i_click_on_register_button()
    {
        registerPage.clickRegisterBtn();
    }
    @Then("I should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {

        System.out.println( getTitle());
    }
    @Then("registration should be successful")
    public void registration_should_be_successful()
    {
        registerPage.getregistrationConfMsg();
    }

    @Then("I click on Add To Cart button of HTC product")
    public void i_click_on_add_to_cart_button_of_htc_product() {
        homePage.clickAddtoCartHTC();

    }


    @Then("I click on Shopping Cart link in the top bar of the homepage")
    public void i_click_on_shopping_cart_link_in_the_top_bar_of_the_homepage() throws InterruptedException {
        Thread.sleep(4000);

        homePage.clickShoppingCartlink();
    }

    @Then("I print the product name of HTC product")
    public void i_print_the_product_name_of_htc_product()
    {
        System.out.println(getTitle());
        shoppingCartPage.getTextProductHTC();
    }
    @Then("I print the subtotal price value of product HTC")
    public void i_print_the_subtotal_price_value_of_product_htc()
    {
        shoppingCartPage.getSubtotalValueHTC1();
    }
    @Then("I print the shipping value of product HTC")
    public void i_print_the_shipping_value_of_product_htc()
    {
        shoppingCartPage.getShippingValueHTC1();
    }
    @Then("I print the tax value of product HTC")
    public void i_print_the_tax_value_of_product_htc()
    {
        shoppingCartPage.getTaxValueHTC1();
    }
    @When("I clear the number of items in the item box")
    public void i_clear_the_number_of_items_in_the_item_box()
    {
        shoppingCartPage.getnumberofItemsinbox();
    }
    @Then("I update the number of items to {string}")
    public void i_update_the_number_of_items_to(String numberofitems)
    {
        shoppingCartPage.updatenumberofItemsinbox(2);
    }

    @Then("I click on update shopping cart button")
    public void iClickOnUpdateShoppingCartButton()
    {
        shoppingCartPage.shoppingCartLink();
    }

    @Then("I print the updated subtotal price value of product HTC")
    public void i_print_the_updated_subtotal_price_value_of_product_htc()
    {
        shoppingCartPage.getSubtotalValueHTC2();
    }
    @Then("I print the updated shipping value of product HTC")
    public void i_print_the_updated_shipping_value_of_product_htc()
    {
        shoppingCartPage.getShippingValueHTC2();
    }
    @Then("I print the updated tax value of product HTC")
    public void i_print_the_updated_tax_value_of_product_htc()
    {
        shoppingCartPage.getTaxValueHTC2();
    }



}
