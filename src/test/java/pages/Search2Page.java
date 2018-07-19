package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search2Page {

    private By firstString = By.cssSelector("a[accesskey='1']");
    private final WebDriver driver;

    public Search2Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getResult() {

        return driver.findElement(firstString).getText();
    }


}


