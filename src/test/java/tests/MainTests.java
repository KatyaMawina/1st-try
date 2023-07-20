package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;

public class MainTests extends BaseTest {
    @Test
    public void canGoToItSolutionTest() {
        driver.findElement(By.linkText("ИТ-решения")).click();

        String header = driver.findElement(By.tagName("h1")).getText();
        Assertions.assertEquals("IT-решения", header);
    }

    @Test
    public void canGoItSolutionPageObjectTest() {
        String header = new MainPage(driver)
                .goToItSolutions()
                .getHeaderName();

        Assertions.assertEquals("IT-решения", header);
    }
}
