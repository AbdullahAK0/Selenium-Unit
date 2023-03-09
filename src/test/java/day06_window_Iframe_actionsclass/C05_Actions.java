package day06_window_Iframe_actionsclass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;
import java.util.Set;

public class C05_Actions extends TestBase {

    @Test
    public void test01(){

        // 2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // 3- Cizili alan uzerinde sag click yapin
        Actions actions =new Actions(driver);
        WebElement ciziliAlan = driver.findElement(By.id("hot-spot"));
        actions.contextClick(ciziliAlan).perform();
        bekle(3);
        // 4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String actualYazi = driver.switchTo().alert().getText();
        String expectedIcerik = "You selected a context menu";

        Assert.assertEquals(actualYazi,expectedIcerik);

        // 5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        // 6- Elemental Selenium linkine tiklayalim
        String ilkSayfaWHD = driver.getWindowHandle();
        driver.findElement(By.linkText("Elemental Selenium")).click();
        Set<String> tumSayfaWHD = driver.getWindowHandles();

        String ikinciSayfaWHD = "";

        for (String each:tumSayfaWHD) {
            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaWHD=each;
            }

        }
        // 7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        driver.switchTo().window(ikinciSayfaWHD);
        expectedIcerik="Elemental Selenium";
        actualYazi = driver.findElement(By.tagName("h1")).getText();

        Assert.assertTrue(actualYazi.contains(expectedIcerik));
    }
}
