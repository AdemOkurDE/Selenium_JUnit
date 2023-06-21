package tests.day07_testBase_dropdown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C04_JsAlerts extends TestBase {
    /*
        Birtesti calistirirken web sayfasi bize uyari verebilir
        buna Aletr denir

        eger bu uyariyi sag tus yapabiliyorsak bu bir html alert dir
        ve diger tum Webelementler gibi locate edilebilirlerve kullanilabilirler

        ANCAK
        sag click yapip inspect edemiyorsak
        bunlar javascript alert olabilir

     */

    @Test
    public void test01() {

        // 3 test method'u olusturup asagidaki gorevi tamamlayin
        // 1. Test
        //         - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // - 1.alert'e tiklayin
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();

        //         - Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String actualAlertYazisi = driver.switchTo().alert().getText();
        String expectedAlertYazisi = "I am a JS Alert";
        Assert.assertEquals(expectedAlertYazisi, actualAlertYazisi);
        bekle(2);
        //         - OK tusuna basip alert'i kapatin
        bekle(2);
        driver.switchTo().alert().accept();
        bekle(1);
    }
        // 2.Test
    @Test
    public void test02() {
        //         - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // - 2.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();

        //         - Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        driver.switchTo().alert().dismiss();
        String expectedSonucYazisi = "You clicked: Cancel";
        String actualSonucYazisi = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertEquals(expectedSonucYazisi, actualSonucYazisi);
        bekle(1);
    }

        // 3.Test

    @Test
    public void test03(){
        //         - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // - 3.alert'e tiklayalim
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();

        //         - Cikan prompt ekranina "Abdullah" yazdiralim
        driver.switchTo().alert().sendKeys("Abdullah"+ Keys.ENTER);
        bekle(2);
        //         - OK tusuna basarak alert'i kapatalim
        driver.switchTo().alert().accept();
        bekle(1);

        //         - Cikan sonuc yazisinin Abdullah icerdigini test edelim
        String expectedSonucYazisi = "Abdullah";
        String actualSonucYazisi = driver.findElement(By.xpath("//*[@id='result']")).getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        bekle(1);
    }
}
