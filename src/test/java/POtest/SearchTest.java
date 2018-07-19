package POtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void poTest() {
        search1Page.search("пенза погода");
        String weather = search2Page.getResult();
        Assert.assertEquals("Погода в Пензе", weather);
    }
}
