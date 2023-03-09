package day09_excel_screenshot_javaexecuter;

import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C02_ReadExcel {

    @Test
    public void test01() throws IOException {

        String dosyaYolu = "src/test/java/day09_excel_screenshot_javaexecuter/ulkeler.xlsx";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);



        //- 1.satirdaki 2.hucreye gidelim ve yazdiralim
        System.out.println(workbook.getSheet("Sayfa1").getRow(0).getCell(1));

        //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String istenenData = workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();

        //- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expectedData = "Kabil";
        String actualData = workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString();

        Assert.assertEquals(expectedData,actualData);

        //- Satir sayisini bulalim
        // getLastRowNum() bize son satirin index'ini verir.
        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum()+1;
        System.out.println(satirSayisi);

        //- Fiziki olarak kullanilan satir sayisini bulun
        System.out.println("Sayfa2 satir sayisi : "+(workbook.getSheet("Sayfa2").getLastRowNum()+1));
        System.out.println(workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());

        //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

        Map<String,String> ulkelerMap = new TreeMap<>();
        int sonsatirIndexi = workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 1; i <=sonsatirIndexi ; i++) {
            String ulke = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            String baskent = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();

            ulkelerMap.put(ulke,baskent);

        }

        System.out.println(ulkelerMap);

        Set<Map.Entry<String,String>> ulkelerEntrySet = ulkelerMap.entrySet();

        for (Map.Entry<String,String> eachEntrySet:ulkelerEntrySet) {
            System.out.println(eachEntrySet);

        }

    }
}
