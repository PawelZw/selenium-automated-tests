package militaria.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorHomeSiteTests {

    @Test
    public void findElementsHomePage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/");

        driver.findElement(By.linkText("O nas"));
        driver.findElement(By.linkText("Pomoc"));
        driver.findElement(By.linkText("Kontakt"));
        driver.findElement(By.linkText("Status zamówienia"));

        driver.findElement(By.className("ksk-header"));
        driver.findElement(By.linkText("Logowanie"));
        driver.findElement(By.className("wishlist"));

        driver.findElement(By.linkText("Bestsellery"));
        driver.findElement(By.linkText("Męskie Prezenty"));
        driver.findElement(By.linkText("Nowości"));
        driver.findElement(By.linkText("Promocje"));
        driver.findElement(By.linkText("Grawer"));
        driver.findElement(By.linkText("Karty podarunkowe"));
        driver.findElement(By.linkText("Promocje KSK"));

        driver.findElement(By.linkText("Strzelectwo"));
        driver.findElement(By.linkText("Samoobrona"));
        driver.findElement(By.linkText("Outdoor"));
        driver.findElement(By.className("text"));

        driver.findElement(By.linkText("Wiatrówki i akcesoria"));
        driver.findElement(By.linkText("Air Soft Gun"));
        driver.findElement(By.linkText("Kurtki"));
        driver.findElement(By.linkText("Spodnie"));
        driver.findElement(By.linkText("Buty wojskowe"));
        driver.findElement(By.linkText("Blackout"));
        driver.findElement(By.linkText("Noktowizory i termowizory"));
        driver.findElement(By.linkText("Hełmy i kamizelki kuloodporne"));
        driver.findElement(By.linkText("Nakrycia głowy i chusty"));


        // driver.findElement(By.linkText("Latarki i oświetlenie"));
        // driver.findElement(By.linkText("Noże, miecze, maczety"));
        // driver.findElement(By.linkText("Lornetki, teleskopy, dalmierze"));
        // driver.findElement(By.linkText("Multitoole"));
        // driver.findElement(By.linkText("Rękawice"));
        // driver.findElement(By.linkText("Odzież termoaktywna"));

        driver.findElement(By.className("help"));
        driver.findElement(By.linkText("Raki a raczki - co wybrać na wyjście w góry zimą?"));
        driver.findElement(By.linkText("Dobry termos — jaki wybrać?"));
        driver.findElement(By.linkText("Strzelaj z czarnym prochem. Prawo, bezpieczeństwo i obsługa"));
        driver.findElement(By.linkText("Jak wybrać wiatrówkę?"));
        driver.findElement(By.linkText("Jaką lunetę kupić - poradnik"));
        driver.findElement(By.linkText("Czym i jak naostrzyć nóż? Przegląd akcesoriów do ostrzenia noży"));
        driver.findElement(By.linkText("Co to jest AirSoft Gun?"));
        driver.findElement(By.linkText("Rodzaje kamuflażu i ich zastosowanie"));
        driver.findElement(By.linkText("czas dostawy"));
        driver.findElement(By.linkText("Zwroty i reklamacje"));

        driver.findElement(By.className("useful-help"));

        driver.findElement(By.linkText("Jakie rękawice zimowe w góry wybrać?"));
        driver.findElement(By.linkText("Noworoczna wyprzedaż – co warto kupić?"));
        driver.findElement(By.linkText("Nakładki antypoślizgowe na buty – jakie kupić?"));
        driver.findElement(By.linkText("Jak wyczyścić termos i kubek termiczny"));
        driver.findElement(By.linkText("Jak zdobyć pozwolenie na broń?"));
        driver.findElement(By.linkText("Skarpety do chodzenia po górach – jak je wybrać?"));
        driver.findElement(By.linkText("Noszenie broni zgodnie z prawem i bezpiecznie"));
        driver.findElement(By.linkText("Gdzie można strzelać z wiatrówki?"));
        driver.findElement(By.linkText("Serwis wiatrówek. Co zrobić samemu, a kiedy oddać do serwisu?"));
        driver.findElement(By.linkText("Ogrzewacze chemiczne – jak ich używać"));
        driver.findElement(By.linkText("Jak zneutralizować działanie gazu pieprzowego?"));

        driver.findElement(By.linkText("Bydgoszcz"));
        driver.findElement(By.linkText("Gdynia"));
        driver.findElement(By.linkText("Katowice"));
        driver.findElement(By.linkText("Kraków"));
        driver.findElement(By.linkText("Łódź"));
        driver.findElement(By.linkText("Poznań"));
        driver.findElement(By.linkText("Przemyśl"));
        driver.findElement(By.linkText("Szczecin"));
        driver.findElement(By.linkText("Warszawa Blue City"));
        driver.findElement(By.linkText("Warszawa Tamka"));
        driver.findElement(By.linkText("Wrocław Bielany"));

        driver.findElement(By.className("producers"));
        driver.findElement(By.linkText("Action Sport Games"));
        driver.findElement(By.linkText("Air Arms"));
        driver.findElement(By.linkText("Bushnell"));
        driver.findElement(By.linkText("Crosman"));
        driver.findElement(By.linkText("Cybergun"));
        driver.findElement(By.linkText("GAMO"));
        driver.findElement(By.linkText("Leatherman"));
        driver.findElement(By.linkText("Maglite"));
        driver.findElement(By.linkText("Olight"));
        driver.findElement(By.linkText("ESP"));
        driver.findElement(By.linkText("Under Armour"));
        driver.findElement(By.linkText("Pentagon"));

        driver.findElement(By.linkText("Koszty dostawy"));
        driver.findElement(By.linkText("Zamów do 23:00 - dostawa jutro!"));
        driver.findElement(By.linkText("Paczka w weekend"));
        driver.findElement(By.linkText("Dostawa w poniedziałek"));
        driver.findElement(By.linkText("Sposoby płatności"));
        driver.findElement(By.linkText("Status zamówienia"));
        driver.findElement(By.linkText("Darmowe i bezterminowe zwroty"));
        driver.findElement(By.linkText("Formularz zwrotu"));
        driver.findElement(By.linkText("International delivery"));
        driver.findElement(By.linkText("Wysyłka do Ukrainy"));

        driver.findElement(By.linkText("Co zyskujesz"));
        driver.findElement(By.linkText("Bezterminowe zwroty"));
        driver.findElement(By.linkText("Logowanie"));

        driver.findElement(By.linkText("Regulamin"));
        driver.findElement(By.linkText("Regulamin KSK"));
        driver.findElement(By.linkText("Polityka cookies"));
        driver.findElement(By.linkText("Polityka prywatności"));
        driver.findElement(By.linkText("Mapa Sklepu"));
        driver.findElement(By.linkText("Reklamacje i gwarancja"));
        driver.findElement(By.linkText("TAX FREE"));
        driver.findElement(By.linkText("Karty podarunkowe"));
        driver.findElement(By.linkText("Kupony i kody rabatowe"));

        //driver.findElement(By.linkText("Prawo"));
        driver.findElement(By.linkText("Posiadanie i zakup wiatrówki"));
        driver.findElement(By.linkText("Zakup paralizatorów, broni alarmowej i czarnoprochowej"));
        driver.findElement(By.linkText("Legalność pałek teleskopowych"));

        driver.findElement(By.className("twitter"));
        driver.findElement(By.className("facebook"));
        driver.findElement(By.className("blog"));
        driver.findElement(By.className("youtube"));
        driver.findElement(By.className("instagram"));
        driver.quit();
    }

    @Test
    public void findElementsAboutUsPage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/o_nas/fakty_i_liczby.xml");

        driver.findElement(By.linkText("Nagrody"));
        driver.findElement(By.linkText("Sklepy"));
        driver.findElement(By.linkText("Praca w Militaria.pl"));
        driver.findElement(By.linkText("Podziękowania"));
        driver.findElement(By.linkText("Partnerzy"));

        driver.findElement(By.className("headerlp"));
        driver.findElement(By.className("logolp"));
        driver.findElement(By.className("od1998"));
        driver.findElement(By.className("wrapperlp"));
        driver.findElement(By.className("sklepy"));
        driver.findElement(By.className("wrapper-wofercie"));
        driver.findElement(By.className("wrapper-wofercie"));
        driver.findElement(By.className("deskimg"));
        driver.quit();
    }
    @Test
    public void findElementsHelpPage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/pomoc.xml");

        driver.findElement(By.id("help_5413"));
        driver.findElement(By.id("help_1014"));
        driver.findElement(By.id("help_1343"));
        driver.findElement(By.id("help_1652"));
        driver.findElement(By.id("help_11864"));
        driver.findElement(By.id("help_1005"));
        driver.findElement(By.id("help_1006"));
        driver.findElement(By.id("help_1007"));
        driver.findElement(By.id("help_13804"));
        driver.findElement(By.id("help_1012"));
        driver.findElement(By.id("help_1258"));
        driver.findElement(By.id("help_1011"));
        driver.findElement(By.id("help_1010"));
        driver.findElement(By.id("help_1018"));
        driver.findElement(By.id("help_1204"));
        driver.findElement(By.id("help_1206"));
        driver.findElement(By.id("help_1208"));
        driver.findElement(By.id("help_7080"));
        driver.findElement(By.id("help_14155"));
        driver.quit();
    }
    @Test
    public void findElementsContactPage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/kontakt.xml");

        driver.findElement(By.id("expand-1"));
        driver.findElement(By.id("expand-2"));
        driver.findElement(By.id("expand-3"));
        driver.findElement(By.id("expand-4"));
        driver.findElement(By.id("expand-5"));
        driver.findElement(By.id("expand-6"));
        driver.findElement(By.id("expand-7"));
        driver.findElement(By.id("expand-8"));
        driver.findElement(By.id("expand-9"));
        driver.findElement(By.id("expand-10"));
        driver.quit();

    }
    @Test
    public void findElementsCustomerClubPage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/klub/logowanie.xml?referer=%2Fklub%2Findex.xml");

        driver.findElement(By.className("popup-title"));
        driver.findElement(By.className("popup-layout"));
        driver.findElement(By.name("login"));
        driver.findElement(By.name("password"));
        driver.findElement(By.className("checkbox-wrapper"));
        driver.findElement(By.className("h3"));
        driver.quit();

    }
    @Test
    public void findElementsShootingCategory() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/strzelectwo_c1297.xml");

        driver.findElement(By.linkText("Wiatrówki i akcesoria"));
        driver.findElement(By.linkText("Air Soft Gun"));
        driver.findElement(By.linkText("Broń czarnoprochowa i akcesoria"));
        driver.findElement(By.linkText("Real Action Marker"));
        driver.findElement(By.linkText("Łuki"));
        driver.findElement(By.linkText("Akcesoria do broni palnej"));
        driver.findElement(By.linkText("Celowniki do broni palnej"));
        driver.findElement(By.linkText("Profesjonalne oporządzenie taktyczne"));
        driver.findElement(By.linkText("Tarcze i cele strzeleckie"));
        driver.findElement(By.linkText("Proce"));
        driver.findElement(By.linkText("Dmuchawki"));
        driver.findElement(By.linkText("Paintball"));
        driver.findElement(By.linkText("Akcesoria RAM"));
        driver.findElement(By.linkText("Hełmy profesjonalne"));
        driver.findElement(By.linkText("Okulary strzeleckie"));
        driver.findElement(By.linkText("Gogle taktyczne"));
        driver.findElement(By.linkText("Rękawice taktyczne"));
        driver.findElement(By.linkText("Ochronniki słuchu i słuchawki aktywne"));
        driver.findElement(By.linkText("Karty podarunkowe"));
        driver.findElement(By.cssSelector("#bottom-wrapper > div > div.body-footer.clearfix > a > img"));
        driver.quit();

    }
    @Test
    public void findElementsSelfdefenceCategory() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/samoobrona_c339.xml");

        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(1) > li:nth-child(1) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(1) > li:nth-child(2) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(1) > li:nth-child(3) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(1) > li:nth-child(4) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(2) > li:nth-child(1) > strong"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(2) > li:nth-child(2) > strong"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(2) > li:nth-child(3) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(2) > li:nth-child(4) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(3) > li:nth-child(1) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(3) > li:nth-child(2) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(3) > li:nth-child(3) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(3) > li:nth-child(4) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(4) > li:nth-child(1) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(4) > li:nth-child(2) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(4) > li:nth-child(3) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(4) > li:nth-child(4) > strong > a"));
        driver.findElement(By.cssSelector("#category-main > div > div:nth-child(5) > div.category-grid > ul:nth-child(5) > li:nth-child(1) > strong > a"));
        driver.quit();

    }
    @Test
    public void findElementsOutdoorCategory() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.militaria.pl/outdoor_c1298.xml");

        driver.findElement(By.linkText("Odzież"));
        driver.findElement(By.linkText("Buty"));
        driver.findElement(By.linkText("Latarki i oświetlenie"));
        driver.findElement(By.linkText("Multitoole"));
        driver.findElement(By.linkText("Noże, miecze, maczety"));
        driver.findElement(By.linkText("Survival, bushcraft, turystyka"));
        driver.findElement(By.linkText("Plecaki"));
        driver.findElement(By.linkText("Pierwsza pomoc i ratownictwo"));
        driver.findElement(By.linkText("Lornetki, teleskopy, dalmierze"));
        driver.findElement(By.linkText("Noktowizory i akcesoria"));
        driver.findElement(By.linkText("Termowizory i akcesoria"));
        driver.findElement(By.linkText("Namioty i akcesoria"));
        driver.findElement(By.linkText("Akcesoria dla psów"));
        driver.findElement(By.linkText("Wykrywacze metali"));
        driver.findElement(By.linkText("Żywność długoterminowa"));
        driver.findElement(By.linkText("Blackout"));
        driver.findElement(By.linkText("Biobezpieczeństwo"));
        driver.findElement(By.linkText("Radiokomunikacja"));
        driver.findElement(By.linkText("Okulary"));
        driver.findElement(By.linkText("Trening i sport"));
        driver.findElement(By.linkText("Torby, nerki i kieszenie"));
        driver.findElement(By.linkText("Książki, multimedia, gadżety"));
        driver.findElement(By.linkText("Alkomaty i narkotesty"));
        driver.findElement(By.linkText("Maski przeciwgazowe"));
        driver.findElement(By.linkText("Przysposobienie obronne"));
        driver.findElement(By.linkText("Wojskowa Klasa Mundurowa"));
        driver.findElement(By.linkText("Karty podarunkowe"));
        driver.quit();
    }
}
