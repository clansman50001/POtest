package POtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;


public class SearchTest extends BaseTest {

    @Test
    public void poTest() {
        homePage = new HomePage(driver);
        resultPage = new ResultPage(driver);
        homePage.search("пенза погода");
        String weather = resultPage.getResult();
        Assert.assertEquals("Погода в Пензе", weather);
    }
}
