package staticPO.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage (WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        this.driver = driver;

    }
}
