package militaria.tests.checboxtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AvailabilityInStoreFilterCheckboxAirGun {

    /** Tests for the appearance of checkboxes in the Air Gun site filtering category: Availability in store
     *  in the tab https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml **/


    @Test
    public void checkboxBydgoszcz() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_231502\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();
    }




    @Test
    public void checkboxGdynia() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_154118\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxKatowice() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_526051\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

   @Test
    public void checkboxKrakow() {

       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(options);
       driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

       JavascriptExecutor jsx = (JavascriptExecutor)driver;
       jsx.executeScript("window.scrollBy(0,800)", "");

       driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
       WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_286925\"]/a"));
       System.out.println(checkbox.isSelected());
       checkbox.click();
       driver.quit();


    }

    @Test
    public void checkboxLodz() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_1012937\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxPoznan() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_1012976\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxPrzemysl() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_2684865\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxSzczecin() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_231503\"]/a"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxWarszawaBlueCity() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_447306\"]/a"));
        System.out.println(checkbox.isSelected());

        JavascriptExecutor jsf = (JavascriptExecutor)driver;
        jsf.executeScript("window.scrollBy(0,400)", "");

        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxWarszawaTamka() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_137664\"]/a"));
        System.out.println(checkbox.isSelected());

        JavascriptExecutor jsf = (JavascriptExecutor)driver;
        jsf.executeScript("window.scrollBy(0,400)", "");

        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxWroclawBielany() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_772206\"]/a"));
        System.out.println(checkbox.isSelected());

        JavascriptExecutor jsf = (JavascriptExecutor)driver;
        jsf.executeScript("window.scrollBy(0,400)", "");

        checkbox.click();
        driver.quit();


    }

    @Test
    public void checkboxWroclawOlawska() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://militaria.pl/c/wiatrowki-karabinki-7820");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,800)", "");

        driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"wp_ln_attr_1563_65631\"]/a"));
        System.out.println(checkbox.isSelected());

        JavascriptExecutor jsf = (JavascriptExecutor)driver;
        jsf.executeScript("window.scrollBy(0,400)", "");

        checkbox.click();
        driver.quit();

    }
}
