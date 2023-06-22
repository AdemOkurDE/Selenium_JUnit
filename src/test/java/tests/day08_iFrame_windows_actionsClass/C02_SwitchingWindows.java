package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
import utilities.TestBaseQuit;

public class C02_SwitchingWindows extends TestBaseQuit  {
    // amazon ana sayfaya gidin
    // url'in amazon icerdigini test edin


    // Yeni bir tab olarak wise quarter anasayfaya gidin
    // title'in Wise icerdigini test edin

    // yeni bir window acarak youtube sayfasina gidin
    // url'in youtube icerdigini test edin

    // acilan tum sayfalari kapatin
    @Test
    public void test01(){
        // amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");
        // url'in amazon icerdigini test edin
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));

        // Yeni bir tab olarak wise quarter anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");
        // title'in Wise icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Wise"));

        // yeni bir window acarak youtube sayfasina gidin
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        // url'in youtube icerdigini test edin
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));

        // acilan tum sayfalari kapatin


    }
}
