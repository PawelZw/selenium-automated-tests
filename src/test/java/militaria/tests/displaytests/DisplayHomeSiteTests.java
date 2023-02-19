package militaria.tests.displaytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayHomeSiteTests {


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
        System.out.println(driver.findElement(By.linkText("Męskie Prezenty")).isDisplayed()) ;
        System.out.println(driver.findElement(By.linkText("Nowości")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Promocje")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Grawer")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Karty podarunkowe")).isDisplayed());
        System.out.println(driver.findElement(By.linkText("Promocje KSK")).isDisplayed());


        driver.quit();
    }
}
