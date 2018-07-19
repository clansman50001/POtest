package POtest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest {

    @Test
    public void poTest() {
        homePage.search("пенза погода");
        String weather = resultPage.getResult();
        Assert.assertEquals("Погода  Пенза", weather);
    }
}
