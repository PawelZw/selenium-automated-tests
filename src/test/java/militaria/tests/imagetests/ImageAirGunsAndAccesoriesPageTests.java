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

public class ImageAirGunsAndAccesoriesPageTests {

    /** The class contains image upload assertions for the Air Gun Accesories page https://militaria.pl/c/wiatrowki-i-akcesoria-7742 **/

    @Test
    public void imageAirGunCarabinersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[2]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);

        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imagePistolsRevolversUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[3]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }
    @Test
    public void imageAirGunSerialShootingUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[4]/div/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }


    @Test
    public void imageAirGunGasSpringUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[5]/div/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAirGunPCPUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[6]/div/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAirGunPCAUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[7]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAirGunWithEngraverUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[8]/div/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAirGunProducersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[9]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAirGunTo500UploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[10]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageBuckshotUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[11]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

    @Test
    public void imageAccessoriesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-i-akcesoria-7742");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/ul/li[12]/div[1]/div/a/img"));
        String height = image.getAttribute("height");
        System.out.println(height);
        Assert.assertEquals(height, "133");
        driver.quit();
    }

}
