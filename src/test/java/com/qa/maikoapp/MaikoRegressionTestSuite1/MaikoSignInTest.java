package com.qa.maikoapp.MaikoRegressionTestSuite1;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qa.maikoapp.Base.MaikoTestBase;
import com.qa.maikoapp.Pages.AdminPage;
import com.qa.maikoapp.Pages.SignInPage;

public class MaikoSignInTest extends MaikoTestBase{
    SignInPage maikosigninpageobj;
    AdminPage adminpageobj;    
    ExtentReports extent = new ExtentReports();
    File file = new File(System.getProperty("user.dir")+"\\ExtentReports\\eReport.html");
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
    ExtentTest test = extent.createTest("maikoRegressionTestCycle1");
    

    public MaikoSignInTest(){
        super();
    }

      @BeforeTest
    public void openMaikoApp() throws InterruptedException, IOException{
        extent.attachReporter(sparkReporter);      
        LaunchMaikoApp();
        test.pass("Successfully Opened Maiko App");
        maikosigninpageobj = new SignInPage();
    }
    @Test(priority = 1)
    public void userAbleToSingInMaikoAppTest() throws InterruptedException, IOException{
        maikosigninpageobj = new SignInPage();
        maikosigninpageobj.maikoSingin();
        test.pass("Successfully signIn to the MaikoApp");
    }
    @Test(priority = 2)
    public void accessAdminPanelTest() throws InterruptedException, IOException{
        adminpageobj = new AdminPage();
        adminpageobj.accessAdminPanel();
        test.pass("Successfully Access the Admin panel");
    }
    @Test(priority = 3)
    public void createNewassistantTest() throws InterruptedException, IOException{
        adminpageobj = new AdminPage();
        adminpageobj.createNewAssistant();
        test.pass("Successfully Created a new Assistant");
    }
    @Test(priority = 4)
    public void searchCreatedAssistantTest() throws InterruptedException, IOException{
        adminpageobj = new AdminPage();
        adminpageobj.searchCreatedAssistant();
        test.pass("Successfully searched a Created new Assistant");
    }
    @Test(priority = 5)
    public void editedcreatedassistantTest() throws InterruptedException, IOException{
        adminpageobj = new AdminPage();
        adminpageobj.editcreatedassistant();
        test.pass("Successfully Updated a new Assistant");

    }
    @Test(priority = 6)
    public void deletecreatedAssistant() throws InterruptedException, IOException{
        adminpageobj = new AdminPage();
        adminpageobj.deleteAssistant();
        test.pass("Successfully delete the assistant ");
    }
    @Test(priority = 7)
    public void logout() throws IOException{
        //maikosigninpageobj = new SignInPage();
        maikosigninpageobj.maikoLogout();
        test.pass("Successfully Logged out");
    }
    @AfterTest
    public void closeMaikoApp(){
    driver.close();
    test.pass("Close the MaikoApp and Browser");
    extent.flush();
    }
    
}
