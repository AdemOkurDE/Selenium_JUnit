package tests.Adm_Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P02_11_07_Elif extends TestBase {

    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement hp=driver.findElement(By.xpath("//section[@id='slider']"));
        Assert.assertTrue(hp.isDisplayed());
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts=driver.findElement(By.className("features_items"));
        Assert.assertTrue(allProducts.isEnabled());
        //6. The products list is visible
        WebElement allProducts1=driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(allProducts1.isDisplayed());
        //7. Click on 'View Product' of first product
        //  WebElement viewProduct=driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        //viewProduct.click();
        bekle(3);
        WebElement firstProduct=driver.findElement(By.xpath("(//*[text()='View Product'])[1]"));

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);

        firstProduct.click();
        //8. User is landed to product detail page
        String actualUrl= driver.getCurrentUrl();
        String expectedIcerik="product_detail";
        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        bekle(120);
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand



    }

}
