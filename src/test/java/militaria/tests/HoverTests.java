package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTests {

    @Test
    public void performAction() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Bestsellery"));
        actions.moveToElement(heading).perform();

    }
}
