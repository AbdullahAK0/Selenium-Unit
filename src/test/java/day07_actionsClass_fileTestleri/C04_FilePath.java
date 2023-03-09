package day07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
    public void test01(){

        // bilgisayarimizin temel dosya yolu user.home
        // C:\Users\Lenovo

        // icinde bulundugumuz projenin temel dosya yolu user.dir
        // C:\Users\Lenovo\Desktop\gitHubTeam108\seleniumTeam108

        // C:\Users\Lenovo\Desktop\MySQL T108
        String dosyaYolu = "C:\\Users\\Lenovo\\Desktop\\MySQL T108";
        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);

        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var

            ancak herkesin bilgisayarindaki dosya yollari farkliliklar gosterir.

            Herkesin bilgisayarina gore farkli olan kismi Java'dan bir komut ile elde edebiliriz.
         */

        System.out.println(System.getProperty("user.home"));

        dosyaYolu = System.getProperty("user.home"+"Desktop\\MySQL T108");

        System.out.println(System.getProperty("user.dir"));

    }
}
