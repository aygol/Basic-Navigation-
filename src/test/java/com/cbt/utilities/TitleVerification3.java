package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static com.cbt.utilities.BrowserFactory.getDriver;

public class TitleVerification3 {
    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com", "https://www.westelm.com/");
        getDriver("chrome");
        // WebDriver driver=new ChromeDriver();
        for(String eachurl:urls) {
            WebDriver driver=new ChromeDriver();
            driver.get(eachurl);
            Thread.sleep(3000);
            if( eachurl.contains(driver.getTitle().toLowerCase().trim().replace(" ",""))){
                Thread.sleep(2000);
                System.out.println("Title = "+driver.getTitle());
                System.out.println(eachurl+" = Test passed");
            }else{
                System.out.println("Title = "+driver.getTitle());
                System.out.println(eachurl+" = Test Failed");

            }driver.quit();

        }

    }
}
