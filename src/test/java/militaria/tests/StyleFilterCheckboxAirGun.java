package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StyleFilterCheckboxAirGun {

    @Test
    public void checkboxHunting() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,950)", "");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ff-ext-1100_mysliwska_Mysliwska_3ZusC\"]"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }
}
