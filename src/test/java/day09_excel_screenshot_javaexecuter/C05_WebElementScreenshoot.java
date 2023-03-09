package day09_excel_screenshot_javaexecuter;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.security.Key;

public class C05_WebElementScreenshoot extends TestBase {

    @Test
    public void test01() throws IOException {

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Nutella icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        // Sonuclarin Nutella icerdigini test edin
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String actualSonucYazisi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        String expectedIcerik = "Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // ve rapora eklemek icin sonuc yazisi elementinin fotografini cekin.

        // 1- fotografi cekilecek elementi locate edin
        // 2- dosyayi kaydetmek icin bir file olusturun
        File elementSs = new File("target/elementScreenshoot.jpg");

        // 3- webelement ile screenshoot cekip gecici dosyaya kaydedin
        File geciciDosya = sonucYazisiElementi.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi elementSs'e kopyalayalim
        FileUtils.copyFile(geciciDosya,elementSs);
    }
}
