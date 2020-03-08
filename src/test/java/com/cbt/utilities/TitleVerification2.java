package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

import static com.cbt.utilities.BrowserFactory.getDriver;

public class TitleVerification2 {
    public static void main(String[] args) throws Exception {
        //Tests: Title and URLtest 2
        // 1.Create a new class TitleVerification2under utilities package
        // and create a main method.
        // 2.Add this ArrayList declaration to the main method:
        // List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
        // "https://wayfair.com/", "https://walmart.com, "https://westelm.com/");
        // 3.Visit all websites one by one.
        // 4.Verify that URLof the website contains the title of the website.
        // Ignore spaces and casein comparison.
        // For example,title of in the first web sitetitle is Lulu and
        // Giorgiaand the URLis https://lulugandgeorgia.com. So,this test case must pass.
        // 5.Close the browser at theendof the test.

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com/");
        getDriver("chrome");
        WebDriver driver=new ChromeDriver();
        for(int i=0;i<urls.size();i++) {
           // Thread.sleep(2000);
            driver.get(urls.get(i));
            Thread.sleep(3000);

          if( urls.get(i).substring(8,urls.get(i).indexOf(".com")).contains(driver.getTitle().toLowerCase().trim().replace(" ",""))){
             Thread.sleep(2000);
             System.out.println(urls.get(i)+" = Test passed");
            }else{
             System.out.println("Test Failed");
         }
        }
        driver.quit();
    }
}
