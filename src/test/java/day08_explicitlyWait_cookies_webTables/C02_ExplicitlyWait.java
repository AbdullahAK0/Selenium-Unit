package day08_explicitlyWait_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitlyWait {

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusu clickable oluncaya kadar bekleyin


        // ExplicitlyWait icin
        // 1- Wait objesi olustur
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        // 2- Mumkunse webelementi locate et
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // 3- wait objesi kullanarak istenen gorev icin bekle
        wait.until(ExpectedConditions.elementToBeClickable(aramaKutusu));

        // Nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        Thread.sleep(5000);
    }
}
