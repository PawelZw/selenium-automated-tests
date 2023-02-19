package militaria.tests.imagetests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ImageHomePageTests {

    @Test
    public void imageAirGunUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[1]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
    }

    @Test
    public void imageAirSoftGunUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[2]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
    }
}
