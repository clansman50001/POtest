package POtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Search1Page;
import pages.Search2Page;

import java.util.concurrent.TimeUnit;

public class SearchTest {
    public static WebDriver driver;
    public static Search1Page search1Page;
    public static Search2Page search2Page;

    @BeforeClass

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver = new ChromeDriver();
        search1Page = new Search1Page(driver);
        search2Page = new Search2Page(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru");
    }

    @Test
    public void poTest() {
        search1Page.search("пенза погода");
        String weather = search2Page.getResult();
        Assert.assertEquals("Погода в Пензе", weather);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();


    }


}
