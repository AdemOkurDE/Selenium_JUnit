package tests.Adm_Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import utilities.TestBase;
import utilities.TestBaseQuit;

public class P01_Sayfa117_Soru extends TestBaseQuit {


    @Test
    public void test01(){
        //  1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        bekle(1);
        WebElement iframeCookies= driver.findElement(By.className("faktor-iframe-wrapper"));
        driver.switchTo().frame(iframeCookies);
        driver.findElement(By.xpath("(//div[@class='action-wrapper'])[3]")).click();
        driver.switchTo().defaultContent();
        //  2) sayfadaki iframe sayısını bulunuz.
        WebElement iframeYoutube= driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(iframeYoutube);

        //  3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
        bekle(0);
        //  4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
        //  5) ikinci iframe'deki (Jmeter Made Easy) linke
        WebElement iframe02= driver.findElement(By.id("a077aa5e"));
        driver.switchTo().frame(iframe02);
        driver.findElement(By.tagName("a")).click();
        //  (https://www.guru99.com/live-selenium-project.html) tıklayınız

        bekle(0);
    }

}
