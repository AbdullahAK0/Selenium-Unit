package day04JUnitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertions {

    /*
            JUnit testlerin passed ya da failed olduguna
            kodlarin calisirken sorun olup olmadigina gore karar verir.
     */
    String str1="Ali";
    String str2="ali";


    @Test
    public void test01(){

        // str1'in str2'ye esit oldugunu test edin

        Assert.assertEquals("karsilastirilan degerler farkli",str1,str2);

       /* if (str1.equals(str2)){
            System.out.println("esitlik testi PASSED");
        }else {
            System.out.println("esitlik testi FAILED");
        }

        */

    }
    @Test
    public void test02(){

        // str1'in A harfini icerdigini test edin

        Assert.assertTrue("str1 istenen harfi icermiyor",str1.contains("A"));

       /* if (str1.contains("A")){
            System.out.println("olumlu test PASSED");
        }else {
            System.out.println("olumlu test FAILED");
        }

        */

    }
    @Test
    public void test03(){

        // str2'nin c harfini icermedigini test edin

        Assert.assertFalse("str2 istenmeyen harfi iceriyor",str2.contains("c"));


       /* if (!str2.contains("c")){
            System.out.println("negatif test PASSED");
        }else {
            System.out.println("negatif test FAILED");
        }

        */

    }
}
