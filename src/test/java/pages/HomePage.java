package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By searchField = By.id("text");
    private By searchButton = By.cssSelector(".search2__button button");
    private final WebDriver driver;


    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

    public void search(String text) {
        driver.findElement(searchField).sendKeys(text);
        driver.findElement(searchButton).click();
        }

}
