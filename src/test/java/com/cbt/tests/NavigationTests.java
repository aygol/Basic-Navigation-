package com.cbt.tests;

import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationTests {
    public static void main(String[] args) throws Exception {
    //1. Open browser
        // 2.Go to website https://google.com.
        // Save the title in a string variable4. Go to https://etsy.com
        // 5. Save the title in a string variable
        // 6. Navigate back to previous page
        // 7. Verify that title is same is in step 3
        // 8. Navigate forward to previous page
        // 9. Verify that title is same is in step 5
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");
        String title =driver.getTitle();
        Thread.sleep(2000);
        System.out.println("title= "+title);
        Thread.sleep(2000);
        driver.get("https://etsy.com");
        String etsyTitle=driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        String titleGoogle=driver.getTitle();
        StringUtility.verifyEquals(title,titleGoogle);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String titletsy2=driver.getTitle();
        Thread.sleep(2000);
        StringUtility.verifyEquals(etsyTitle,titletsy2);



    }
}
