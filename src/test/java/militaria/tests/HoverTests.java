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
    public void performActionBestsellers() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Bestsellery"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionMensGifts() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Męskie Prezenty"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionNews() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Nowości"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionPromotions() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Promocje"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionGraver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Męskie Prezenty"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionGiftCards() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Karty podarunkowe"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionLoyaltyClubPromotions() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Promocje KSK"));
        actions.moveToElement(heading).perform();

    }


    @Test
    public void performActionShooting() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Strzelectwo"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionSelfDefense() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Samoobrona"));
        actions.moveToElement(heading).perform();

    }

    @Test
    public void performActionOutdoor() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.linkText("Outdoor"));
        actions.moveToElement(heading).perform();

    }
}
