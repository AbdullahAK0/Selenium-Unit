package day09_excel_screenshot_javaexecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.WatchEvent;

public class C08_JavaScriptExecuterClick extends TestBase {

    @Test
    public void test01(){
        // wisequarter anasayfaya gidelim
        driver.get("https://www.wisequarter.com");

        // refresh diyerek reklami gecin
        driver.navigate().refresh();

        // Java TestOtomation tanitimina kadar asagiya inin
        WebElement otomasyonElementi = driver.findElement(By.xpath("(//*[@alt='Automation Engineer'])[1]"));
        bekle(3);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView();",otomasyonElementi);

        // ve resmi click yapin
        bekle(3);
        jse.executeScript("arguments[0].click();",otomasyonElementi);
        bekle(3);

        // ekrana "JUnit bitti" yazdirin.
        jse.executeScript("alert('JUnit bitti');");
        bekle(3);

    }
}
