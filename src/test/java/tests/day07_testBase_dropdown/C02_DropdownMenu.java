package tests.day07_testBase_dropdown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C02_DropdownMenu extends TestBase{


    @Test
    public void test01(){
        // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusunun yanindaki dropdown menude 34 secenek oldugunu test edin
            // dropdown menuyu locate et
        WebElement ddm= driver.findElement(By.id("searchDropdownBox"));

            // select clasindan birr oje olusturalim
        Select select= new Select(ddm);

        int expectedOptionSayisi=28;
        int actualOptionSayisi=select.getOptions().size();

        Assert.assertEquals(expectedOptionSayisi,actualOptionSayisi);
        bekle(1);


        // dropdown menuden Baby kategorisini secin
        select.selectByVisibleText("Baby");

        // Arama kutusuna Nutella yazip aratin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // bulunan sonuc sayisinin 10'dan fazla oldugunu test edin
        String sonucYazisi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        String sonucSayisiStr=sonucYazisi.substring(0,sonucYazisi.indexOf(" "));

        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);
        Assert.assertTrue(sonucSayisiInt>10);

        // sectigimiz opsiyonu yazdirin
        ddm=driver.findElement(By.id("searchDropdownBox"));
        select=new Select(ddm);

        System.out.println(select.getFirstSelectedOption().getText());

        // sectigimiz opsiyon'un Baby oldugunu test edin
        String expectedSeciliOption="Baby";
        String actualSeciliOption=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedSeciliOption,actualSeciliOption);
        Assert.assertTrue(actualSeciliOption==expectedSeciliOption);




    }


}
