package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBaseQuit;

public class C03_SwitchingWindow extends TestBaseQuit {

    @Test
    public void test01(){

        driver.get("https://www.amazon.com");
        String amazonHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");
        String wiseQuarterHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        String youtubeHandle=driver.getWindowHandle();

        driver.switchTo().window(amazonHandle);
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));

        driver.switchTo().window(wiseQuarterHandle);
        Assert.assertTrue(driver.getTitle().contains("Wise"));

        driver.switchTo().window(youtubeHandle);
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));



    }

}
