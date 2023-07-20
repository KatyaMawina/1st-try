package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    private ChromeDriver driver;

    public MainPage(ChromeDriver driver){
        this.driver = driver;
    }
    private By itSolutions = By.xpath("//a[contains(text(), 'ИТ-решения')]");

    public ItSolutionsPage goToItSolutions(){
        driver.findElement(itSolutions).click();
        return new ItSolutionsPage(driver);
    }
}
