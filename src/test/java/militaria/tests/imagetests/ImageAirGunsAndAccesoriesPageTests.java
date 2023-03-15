package militaria.tests.imagetests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ImageAirGunsAndAccesoriesPageTests {

    /** The class contains image upload assertions for the Air Guns and Accesories page https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml **/

    @Test
    public void imageAirGunCarabinersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[1]/li[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);

        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imagePistolsRevolversUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[1]/li[2]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "55");
        driver.quit();
    }

    @Test
    public void imageAirGunFiringBurstsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[1]/li[3]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "55");
        driver.quit();
    }

    @Test
    public void imageAirGunGasSpringUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[1]/li[4]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "55");
        driver.quit();
    }

    @Test
    public void imageAirGunPCPUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[2]/li[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageAirGunPCAUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[2]/li[2]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageAirGunWithEngraverUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[2]/li[3]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageAirGunProducersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[2]/li[4]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageAirGunTo500UploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[3]/li[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageBuckshotUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[3]/li[2]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "36");
        driver.quit();
    }

    @Test
    public void imageAccessoriesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria_c334.xml");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"category-main\"]/div/div[3]/div[1]/ul[3]/li[3]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "55");
        driver.quit();
    }

}
