package com.qa.maikoapp.Pages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.maikoapp.Base.MaikoTestBase;
import com.qa.maikoapp.Base.MaikoUtil;

public class AdminPage extends MaikoTestBase {
    Random rand = new Random();
  //Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(1000);
    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[1]/div/div[1]/div/div/div/span[3]/div/button/span")
     WebElement adminmenu;
     
     @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/div[1]/button/h2")
     WebElement createAssistantbutton;

     @FindBy(xpath = "//*[@placeholder='Assistant Name']")
     WebElement assistantNameField;
     @FindBy(xpath = "//*[@aria-label='Featured on Landing Page']")
     WebElement featuredCheckbox;
     @FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[1]/div[1]/select/option[3]")
     WebElement categoryselect;
     @FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[1]/div[2]/select/option[3]")
     WebElement subcategoryselect;
     @FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[2]/div[1]/div/select/option[1]")
     WebElement serviceselect;
     @FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[2]/div[1]/div/select/option[1]")
     WebElement modelselect;
     @FindBy(xpath  = " /html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[3]/div[1]/label/input")
     WebElement youtubecheckbox;
     @FindBy(xpath  = " /html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/span/div/div[2]/div/div/div[3]/div[2]/label/input")
     WebElement UserDocumentUploadcheckbox;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-1']")
     WebElement adminsettingtabGreeting;
     @FindBy(xpath  = "//*[@class='w-full text-input']")
     WebElement greetingtextarea;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement greetingSavebutton;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-2']")
     WebElement adminsettingtabFunction;
     @FindBy(xpath  = "//*[@class='w-full text-input']")
     WebElement functiontextarea;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement fuctionSavebutton;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-3']")
     WebElement adminsettingtabScope;
     @FindBy(xpath  = "//*[@class='w-full text-input']")
     WebElement scopetextarea;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement scopeSavebutton;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-4']")
     WebElement adminsettingtabGuidelines;
     @FindBy(xpath  = "//*[@class='w-full text-input']")
     WebElement guidelinestextarea;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement guidelinesSavebutton;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-5']")
     WebElement adminsettingtabDocumentsandMedia;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement DocumentsandMediaSavebutton;
     @FindBy(xpath  = "//*[@id='admin-settings-tab-6']")
     WebElement adminsettingtabParameters;
     @FindBy(xpath  = "//*[@class='primary-btn lg-btn ']")
     WebElement parametersSavebutton;
     @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/div/h1[2]")
     WebElement createdAssistantName;
     @FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[1]/div/div[2]/div/div/div/div/div/div/h3[1]/b")
     WebElement clickonAssistantManagementSubmenu;
     @FindBy(xpath = "//*[@placeholder='Search Assistants']")
     WebElement searchAssistantField;
     @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/div/div[3]/div[3]/div/div/div/div/div/div[2]/div[2]/div[1]/table/tbody/tr/td[1]")
     WebElement clickonAssistant;
     @FindBy(xpath = "//*[@class='secondary-btn lg-btn']")
     WebElement clickonDeleteButton;
     
     public void accessAdminPanel() throws InterruptedException, IOException{
      adminmenu.click();
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"AdminPage.png");
       }

     public void createNewAssistant() throws InterruptedException, IOException{       
        createAssistantbutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"CreateAssistantPage.png");
        assistantNameField.clear();
        Thread.sleep(3000);
        assistantNameField.sendKeys("AutomationAssistant"+rand_int1);
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage1.png");
        featuredCheckbox.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage2.png");
        categoryselect.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage3.png");
        subcategoryselect.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage4.png");
        serviceselect.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage5.png");
        modelselect.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage6.png");
        youtubecheckbox.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage7.png");
        UserDocumentUploadcheckbox.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantPage8.png");
        adminsettingtabGreeting.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage1.png");
        greetingtextarea.sendKeys("Welcome to Automation Assistant bot");
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage2.png");
        greetingSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage3.png");
        adminsettingtabFunction.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage4.png");
        functiontextarea.sendKeys("Welcome to Automation Assistant bot");
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage5.png");
        fuctionSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GreetingPage6.png");
        adminsettingtabScope.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"ScopePage1.png");
        scopetextarea.sendKeys("Welcome to Automation Assistant bot");
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"ScopePage2.png");
        scopeSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"ScopePage3.png");
        adminsettingtabGuidelines.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GuidelinesPage1.png");
        guidelinestextarea.sendKeys("Welcome to Automation Assistant bot");
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GuidelinesPage2.png");
        guidelinesSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"GuidelinesPage3.png");
        adminsettingtabDocumentsandMedia.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"DocumentsandMediaPage1.png");
        DocumentsandMediaSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"DocumentsandMediaPage2.png");
        adminsettingtabParameters.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"ParametersPage1.png");
        parametersSavebutton.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"ParametersPage1.png");
     }

     public void searchCreatedAssistant() throws InterruptedException, IOException{
        String createdAssistant= createdAssistantName.getText();
        System.out.println("Assistant Name is: " + createdAssistant);
        clickonAssistantManagementSubmenu.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantManagementPage1.png");
        searchAssistantField.sendKeys(createdAssistant);
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantManagementPage2.png");
        clickonAssistant.click();
        Thread.sleep(3000);
        MaikoUtil.captureScreenshot(driver,"AssistantManagementPage3.png");
     }

     public void editcreatedassistant() throws InterruptedException, IOException{
      adminsettingtabGreeting.click();
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"GreetingPage1.png");
      greetingtextarea.clear();
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"GreetingPage2.png");
      greetingtextarea.sendKeys("Updated Assistant bot");
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"GreetingPage3.png");
      greetingSavebutton.click();
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"GreetingPage4.png");

     }
     public void deleteAssistant() throws InterruptedException, IOException{
      clickonDeleteButton.click();
      Thread.sleep(3000);
      //MaikoUtil.captureScreenshot(driver,"DeleteAssistantPage1.png");
      Alert alert = driver.switchTo().alert();
      alert.accept();
      Thread.sleep(3000);
      MaikoUtil.captureScreenshot(driver,"DeleteAssistantPage2.png");
      System.out.println("Assistatn is deleted"); 

     }
     
}
