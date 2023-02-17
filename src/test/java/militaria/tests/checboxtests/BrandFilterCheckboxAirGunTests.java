package militaria.tests.checboxtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrandFilterCheckboxAirGunTests {

    @Test
    public void checkboxFiltersActionSportGames() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-175"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxAirArms() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-164"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxBaikal() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-165"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxBeeman() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-1104"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxBSA() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-155"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxCrossman() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-159"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxCybergun() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-190"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxDaisy() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-1005"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxEkol() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-424"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxFBLucznikRadom() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-855"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxGAMO() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-235"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxHatsan() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-278"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxKralArms() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-1198"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxSigSauer() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-820"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxSwissArms() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-446"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxTM() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-127"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxTSSFortune() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-1490"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboUmarex() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-362"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWalther() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-431"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWeihrauhSport() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-323"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void checkboxWinGun() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/wiatrowki_i_akcesoria/wiatrowki_karabinki_c111.xml");

        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"category-sub\"]/div/aside/div[1]/form/dl[2]/dd/a[1]")).click();
        WebElement checkbox = driver.findElement(By.id("ff-manufacturer-359"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        driver.quit();
    }
}
