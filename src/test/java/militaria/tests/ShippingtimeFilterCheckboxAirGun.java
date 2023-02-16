package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShippingtimeFilterCheckboxAirGun {

    @Test
    public void checkboxImmediately() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shipping-time-1000"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkbox13Months() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shipping-time-1014"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxOutofStocks() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-shipping-time-1008"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }
}
