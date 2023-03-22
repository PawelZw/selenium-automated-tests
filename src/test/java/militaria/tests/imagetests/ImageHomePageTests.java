package militaria.tests.imagetests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ImageHomePageTests {

    /**
     * The class contains image upload assertions for the home page https://www.militaria.pl/
     **/

    @Test
    public void imageAirGunUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/");
        driver.manage().window().maximize();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-0\"]/div/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageFlashlightsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-1\"]/div/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageMultitoolsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-2\"]/div/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "212");
        driver.quit();
    }


    @Test
    public void imageGunPowderUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-3\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageThermoactiveClothesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-4\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageMilitaryShoesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-5\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imagePowerStationUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-6\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageMulticamCammoUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-7\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageNightVisionThermoVisionUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-8\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }

    @Test
    public void imageTacticKnivesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"cat-9\"]/div/img"));
        String height = image.getAttribute("height");
        Assert.assertEquals(height, "212");
        driver.quit();
    }
}
