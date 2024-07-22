package com.qa.maikoapp.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaikoTestBase {
        public static WebDriver driver;
    public MaikoTestBase(){

    }

    public static void LaunchMaikoApp() throws IOException{
        System.out.println( "Hello Maiko Application!" );
        String chromePath= "C:\\MaikoAutomationFrameWork\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://mh-qa.maiko.app/");
        //driver.get("https://infralab.maiko.app/");
        MaikoUtil.captureScreenshot(driver,"homepage.png");
        
    }
    
}
