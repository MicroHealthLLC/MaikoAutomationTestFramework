package com.qa.maikoapp.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.maikoapp.Base.MaikoTestBase;
import com.qa.maikoapp.Base.MaikoUtil;

public class SignInPage extends MaikoTestBase {

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div/div/div/button")
WebElement useragreementlink;
@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[3]/div[2]/div[2]/button[1]")
WebElement acceptuseragreement;
@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div[1]/div/div/button")
WebElement clickonuserinternalauthentication;
@FindBy(xpath = "//input[@name='email']")
WebElement enterUserEmailAddress;
@FindBy(xpath = "//input[@name='password']")
WebElement enterPassword;
@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/div/div[4]/form/button")
WebElement clickonLoginbutton;
@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/div/div[1]/div/header/div/div/span/button")
WebElement clickonLogOutbutton;

public void maikoSingin() throws InterruptedException, IOException{
    useragreementlink.click();
    MaikoUtil.captureScreenshot(driver,"UserAggreementpage.png");
    Thread.sleep(3000);
    acceptuseragreement.click();
    Thread.sleep(3000);
    MaikoUtil.captureScreenshot(driver,"AcceptAggreement.png");
    clickonuserinternalauthentication.click();
    Thread.sleep(3000);
    enterUserEmailAddress.sendKeys("qa_tester@microhealthllc.com");
    Thread.sleep(3000);
    MaikoUtil.captureScreenshot(driver,"Emailfield.png");
    enterPassword.sendKeys("joejoe");
    Thread.sleep(3000);
    MaikoUtil.captureScreenshot(driver,"passwordfield.png");
    clickonLoginbutton.click();
    Thread.sleep(3000);
    MaikoUtil.captureScreenshot(driver,"Assistantpage.png");
}
public void maikoLogout() throws IOException{
    clickonLogOutbutton.click();
    MaikoUtil.captureScreenshot(driver,"MaikoLogoutPage.png");
} 
    
}
