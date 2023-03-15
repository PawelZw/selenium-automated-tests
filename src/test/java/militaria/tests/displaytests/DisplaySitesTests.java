package militaria.tests.displaytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplaySitesTests {


    @Test
    public void displayHomeSiteElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        System.out.println(driver.findElement(By.linkText("O nas")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Pomoc")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Kontakt")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Status zamówienia")).isDisplayed());

        System.out.println(driver.findElement(By.linkText("Bestsellery")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Męskie Prezenty")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Nowości")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Promocje")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Grawer")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Karty podarunkowe")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Promocje KSK")).isDisplayed());

        driver.quit();
    }

    @Test

    public void displayBestsellersSiteElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/bestsellery_c2901.xml?price_min=69");

        System.out.println(driver.findElement(By.xpath("//*[@id=\"category-header\"]/h1")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div[2]/div/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\":0.targetLanguage\"]/span/a/span[1]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div[1]/div[2]/div/p/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div[1]/div[2]/div/ul/li/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div[1]/div[2]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[4]/div/button")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"producers-wrapper\"]/div/strong/span")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]")).isDisplayed());

        driver.quit();
    }
}
