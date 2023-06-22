package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_IFrame extends TestBase {
     // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
     // 2 ) Bir metod olusturun: iframeTest
     // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
     // - Text Box’a “Merhaba Dunya!” yazin.
     // - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.
    @Test
    public void test01(){
        // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com/iframe");
        // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement anIframeElementi= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(anIframeElementi.isDisplayed());

        System.out.println(anIframeElementi.getText());
        // - Text Box’a “Merhaba Dunya!” yazin.
        WebElement iframeElementi= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElementi);
        /*
            Text box elementi iframe icinde oldugu icin direkt kullanilamaz.
            dolayisiyla iframe icine switch-to koduyla gecmek gerek
         */

        WebElement textBoxElementi= driver.findElement(By.tagName("p"));
        textBoxElementi.clear();
        textBoxElementi.sendKeys("Merhaba Dunya!");

        // - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur
        // oldugunu dogrulayin ve  konsolda yazdirin.

        /*
            Bir iframe giris yapildiktan sonra
            normal sayfasda islem yapilamaz. normal sayfaya gecis yapmak gerekir

            defaultContent : anasayfaya gider
            parentFrame : eger ic ice frame ler varsa bir ust iframe e cikar
         */
        driver.switchTo().defaultContent();
        WebElement elementalSeleniumElementi= driver.findElement(By.xpath("//*[text() ='Elemental Selenium']"));
        Assert.assertTrue(elementalSeleniumElementi.isDisplayed());

        System.out.println(elementalSeleniumElementi.getText());

        // elementalSeleniumElementi.click();

        bekle(2);

    }

    public void iframeTest(){


    }
}
