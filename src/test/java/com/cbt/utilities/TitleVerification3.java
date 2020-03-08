package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        for(int i=0;i<urls.size();i++) {
            WebDriver driver=new ChromeDriver();
            driver.get(urls.get(i));
            Thread.sleep(3000);
            if( urls.get(i).contains(driver.getTitle().toLowerCase().trim().replace(" ",""))){
                Thread.sleep(2000);
                System.out.println("Title = "+driver.getTitle());
                System.out.println(urls.get(i)+" = Test passed");
            }else{
                System.out.println("Title = "+driver.getTitle());
                System.out.println(urls.get(i)+" = Test Failed");

            }driver.quit();

        }

    }
}
