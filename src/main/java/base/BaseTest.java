package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.RegisterPage;
import pageObjects.ShoppingCartPage;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest
{
    public static WebDriver driver;
    public static Properties prop;
    public static Properties OR;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LogInPage logIn;
    public static ShoppingCartPage shoppingCartPage;
    public static final String AUTOMATE_USERNAME = "kanupriya3";
    public static final String AUTOMATE_ACCESS_KEY = "5i4xPGv2LBm7q89sWtZp";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeAll
    public static void setUp() throws MalformedURLException {
      prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream(".//src//main//java//config//data.properties");
            prop.load(fs);
        } catch (Exception e) {

            e.printStackTrace();
        }
        OR = new Properties();
        try {
            FileInputStream fs1 = new FileInputStream(".//src//main//java//config//OR.properties");
            OR.load(fs1);
        } catch (Exception e) {

            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(prop.getProperty("url"));

  /*      DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
*/
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        logIn= new LogInPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }

    public String getTitle()

    {
        return driver.getTitle();
    }

    public void refresh()
    {
        driver.navigate().refresh();
    }

    @AfterAll
    public static void tearDown()
    {
        //    driver.quit();
    }




}
