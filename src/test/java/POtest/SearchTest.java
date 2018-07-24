package POtest;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;


public class SearchTest extends BaseTest {

    public static HomePage homePage = new HomePage(driver) ;
    public static ResultPage resultPage = new ResultPage(driver);

    @BeforeClass
    public void beforeTest() {
        homePage = new HomePage(driver) ;
        resultPage = new ResultPage(driver);
    }
    @Test
    public void potest() {

        homePage.search("пенза погода");
        String weather = resultPage.getResult();
        Assert.assertEquals("Погода в Пензе", weather);
    }
}
