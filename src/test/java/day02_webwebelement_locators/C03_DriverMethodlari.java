package day02_webwebelement_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlari {
    public static void main(String[] args) {

        /*
            1.Yeni bir class olusturalim (Homework)
            2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
            3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

         */

        System.setProperty("Webdriver.chrome.driver","driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Facebook title testi PASSED");
        }else {
            System.out.println("Facebook title testi FAİLED "+
                    "\nGerceklesen title: "+ actualTitle);
        }

        String expectedIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Facebook url testi PASSED");
        }else {
            System.out.println("Facebook url testi FAİLED"+
                    "\nGerceklesen url: "+actualUrl);
        }

        /*
            4.https://www.walmart.com/ sayfasina gidin.
            5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
            6.Tekrar “facebook” sayfasina donun
            7.Sayfayi yenileyin
            8.Sayfayi tam sayfa (maximize) yapin
            9.Browser’i kapatin
         */

        driver.get("https://www.walmart.com");
        String valmartExpectedIcerik = "Walmart.com";
        String valmartActualTitle = driver.getTitle();

        if (valmartActualTitle.contains(valmartExpectedIcerik)){
            System.out.println("Walmart title testi PASSED");
        }else {
            System.out.println("Walmart title testi FAİLED");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.close();


    }
}
