package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C05_TestBaseIlkTest extends TestBase {



    @Test
    public void amazonTest(){
        // amazona gidelim
        driver.get("https://www.amazon.com");
        // nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Nutella"+ Keys.ENTER);
        // sonuclarin nutella icerdigini test edelim
        WebElement actualSonucElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String actualIcerik = "Nutella";
        String actualSonucYazisi = actualSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(actualIcerik));
    }

}
