package com.qa.maikoapp.Base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MaikoUtil extends MaikoTestBase {
    public static void captureScreenshot(WebDriver driver, String fileName) throws IOException{
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshots/"+fileName+""));
    }
 
    }
    
    

