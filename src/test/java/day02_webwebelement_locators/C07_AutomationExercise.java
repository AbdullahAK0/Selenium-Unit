package day02_webwebelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_AutomationExercise {

    public static void main(String[] args) {

        /*
            1- https://www.amazon.com/ sayfasına gidin.
            2- Arama kutusuna “city bike” yazip aratin
            3- Görüntülenen sonuçların sayısını yazdırın
            4- Listeden ilk urunun resmine tıklayın.

         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        WebElement sonucYaziElementi = driver.findElement(By.className("rush-component"));
        System.out.println(sonucYaziElementi.getText());

        driver.findElement(By.className("s-image")).click();


        driver.close();
    }
}
