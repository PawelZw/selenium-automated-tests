package militaria.tests.checboxtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AvailabilityInStoreFilterCheckboxAirGun {

    @Test
    public void checkboxWebShop() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1012"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxBydgoszcz() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1023"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxGdynia() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1004"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxKatowice() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1016"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

   @Test
    public void checkboxKrakow() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1010"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxLodz() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1020"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxPoznan() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1019"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxPrzemysl() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1022"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxSzczecin() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1008"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWarszawaBlueCity() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1015"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWarszawaTamka() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1002"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWroclawBielany() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1018"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWroclawOlawska() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[3]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shop-1001"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();

    }
}
