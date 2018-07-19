package POtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.ResultPage;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    public static HomePage homePage;
    public static ResultPage resultPage;

    @BeforeClass

    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        resultPage = new ResultPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
