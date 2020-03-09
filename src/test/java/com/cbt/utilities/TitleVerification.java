package com.cbt.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

import static com.cbt.utilities.BrowserFactory.getDriver;

public class TitleVerification {
    public static void main(String[] args) throws Exception{
     //Tests: Title and URLtest
        // 1.Create a new class TitleVerification under utilitiespackageand
        // create a main method.
        // 2.Add this ArrayList declaration to the main method:
        // List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
        // "http://practice.cybertekschool.com/dropdown",
        // "http://practice.cybertekschool.com/login");
        // 3.Open chrome browser
        // 4.Visit all the websitesfrom step 3and verify that they all have the same title.
        // 5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
        // 6.Close the browser at the end of the test.
         List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        getDriver("chrome");
        WebDriver driver=new ChromeDriver();
        String [] title= new String[urls.size()];
        for(int i=0; i<urls.size();i++) {
            driver.get(urls.get(i));
            Thread.sleep(2000);
            title[i] = driver.getTitle();
            Thread.sleep(2000);
        }if(title[0].equals(title[1])&&title[0].equals(title[2])){
                System.out.println("All Title Equals Test Passed");
            }else{
                System.out.println("Test Failed");
        }
        for(int i=0; i<urls.size();i++) {
           driver.get(urls.get(i));
            Thread.sleep(2000);
           if (urls.get(i).startsWith("http://practice.cybertekschool.com")) {
           System.out.println("All url contain Test Passed");
       }else{
            System.out.println("Test Failed");

       }
     }            driver.quit();}}
