package tests.day08_iFrame_windows_actionsClass;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseQuit;

import java.util.Set;

public class C04_SwitchingWindow extends TestBaseQuit {

    @Test
    public void test01(){
    // https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String windowHandle= driver.getWindowHandle();

    // Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String actual = driver.findElement(By.tagName("h3")).getText();
        String expected = "Opening a new window";
        Assert.assertEquals(expected,actual);

    // Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        expected="The Internet";
        actual=driver.getTitle();
        Assert.assertEquals(expected,actual);

    // Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        Set<String> wHDSeti=driver.getWindowHandles();

        String ikinciSafyaHandle="";
        for (String each: wHDSeti
        ) {
            if (!each.equals(windowHandle)){
                ikinciSafyaHandle=each;
            }
        }

        driver.switchTo().window(ikinciSafyaHandle);

        // Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        expected="New Window";
        actual=driver.getTitle();
        Assert.assertEquals(expected,actual);

    // Sayfadaki textin “New Window” olduğunu doğrulayın.
        expected="New Window";
        actual=driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(expected,actual);

    // Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.switchTo().window(windowHandle);
        expected="The Internet";
        actual=driver.getTitle();
        Assert.assertEquals(expected,actual);


    }


}
