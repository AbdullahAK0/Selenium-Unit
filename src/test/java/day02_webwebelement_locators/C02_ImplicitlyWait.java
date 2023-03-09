package day02_webwebelement_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicitlyWait {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","driver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ********************* bu 4 satira tum class'larda ihtiyacimiz olacak *****************

        /*
            driver'i bir web uygulamasina gonderdigimizde
            o sayfanin acilmasi, orada istedigimiz islemleri
            yapmak icin elementleri bulmasi gibi islemler zaman
            gerektirebilir.

            implicitliWait bu tur zaman isteyen islemler icin
            driver'in maksimum ne kadar bekleyecegini belirler.

         */

    }
}
