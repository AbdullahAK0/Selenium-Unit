package day02_webwebelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercise {
    public static void main(String[] args) {

        /*
            1- Bir test class’i olusturun ilgili ayarlari yapin
            2- https://www.automationexercise.com/ adresine gidin
            3- Sayfada 147 adet link bulundugunu test edin.
            4- Products linkine tiklayin
            5- special offer yazisinin gorundugunu test edin
            6- Sayfayi kapatin

         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com");
        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi = 147;

        int actualLinkSayisi = linkElementleriList.size();

        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else {
            System.out.println("Link sayisi testi FAİLED"+"\nSayfada var olan link sayisi: "+actualLinkSayisi);
        }

        driver.findElement(By.partialLinkText(" Products")).click();

        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");


        }
        driver.close();
    }
}
