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

    /** The class contains image upload assertions for the home page https://www.militaria.pl/ **/

    @Test
    public void imageAirGunUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[1]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageAirSoftGunUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[2]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageGunPowderWeaponUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[3]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageJacketsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[4]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageTrousersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[5]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageArmyShoesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[6]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imagePowerStationUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[7]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }


    @Test
    public void imageNightVisionGoglesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[8]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageHelmetsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[9]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageBackpacksUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[10]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageFlashlightsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[11]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageKnivesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[12]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imagePepperGasesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[13]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageMultitoolsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[14]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageHandglovesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[15]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageThermoactiveClothingUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[16]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageHeadwearUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[17]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageCammoUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[18]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageTelescopesUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[19]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageTelescopicBatonsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[20]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageTrainingandSportUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[21]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageTasersUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[22]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageSleepingBagsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[22]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageSurvivalUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[24]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageMetalDetectorsUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/p/span[1]")).click();

        WebElement image = driver.findElement(By.xpath("//*[@id=\"categories-wrapper\"]/div/div/ul/li[25]/a[1]/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }
         /** Social media icons (Twitter, FB, IG, YT ) at the bottom of the home page. **/

    @Test
    public void imageTwitterUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"bottom-wrapper\"]/div/div[1]/div/ul/li[1]/a/span/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageFacebookUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"bottom-wrapper\"]/div/div[1]/div/ul/li[2]/a/span/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageBlogUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"bottom-wrapper\"]/div/div[1]/div/ul/li[3]/a/span/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageYouTubeUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"bottom-wrapper\"]/div/div[1]/div/ul/li[4]/a/span/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }

    @Test
    public void imageInstagramUploadTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        WebElement image = driver.findElement(By.xpath("//*[@id=\"bottom-wrapper\"]/div/div[1]/div/ul/li[5]/a/span/img"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals("height", "height");
        driver.quit();
    }
}
