package day02_webwebelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","driver/chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon ana sayfaya gidin.
        driver.get("https://www.amazon.com");

        // arama kutusunu locate edip bir webelement olarak kaydedin.
        // id'si twotabsearctextbox olan webelement seklinde locate edecegiz.

        /*
            driver'a webelementi tarif etme islemine locate
            bu tarifi yapabilmek icin kullanacagimiz degiskenlere de LOCATOR denir

            8 tane Locator vardır
            Locator'larin 6 tanesi webelementin ozelliklerine baglidir
                1- id
                2- classname
                3- name
                4- tagname
                5- linkText
                6- partialLinkText
            Geriye kalan 2 locator ise her turlu webelemnti locate etmek icin kullanilabilir.
                7- xpath
                8- cssSelector.

         */

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); // locate islemi


        // arama kutusuna "Nutella" yazip aratin.

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(3000);
    }
}
