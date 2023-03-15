package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchAirGunTests {

    @Test
    public void performActionBestsellers() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");
        driver.manage().window().maximize();

       // driver.findElement(By.linkText("Wiatrówki i akcesoria")).click();
       // driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[1]/li[1]/strong/a")).click();

       String productName = driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/div[3]/div[3]/div/ul/li[1]/div[1]/div/a")).getText();

       System.out.println(productName);

       Assert.assertEquals(productName, "Wiatrówka Crosman Mag-Fire Mission Nitro Piston Elite 4,5 mm z lunetą 4x32 (17-CMM7SXS)");
       driver.quit();

    }
}
