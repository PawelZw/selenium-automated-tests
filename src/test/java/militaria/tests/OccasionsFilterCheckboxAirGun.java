package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OccasionsFilterCheckboxAirGun {

    @Test
    public void checkboxEngraver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("list_show_2763"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxBestsellers() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("list_show_2901"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxNews() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("list_show_790"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxMensPresents() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("list_show_1426"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }
}
