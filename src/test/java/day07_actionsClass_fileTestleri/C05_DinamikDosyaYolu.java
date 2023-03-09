package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYolu {

    @Test
    public void test01(){

        // Masaustumuzde ismi MYSQL T108 isimli bir dosya bulundugunu test edin

        String dosyaYolu = System.getProperty("user.home")+"/Desktop/MySQL T108";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
