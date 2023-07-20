package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItSolutionsPage {
    private ChromeDriver driver;

    public ItSolutionsPage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By header = By.xpath("//h1");

    public String getHeaderName() {
        return driver.findElement(header).getText();
    }
}
