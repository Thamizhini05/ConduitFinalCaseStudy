package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginValidationPage {
	@FindBy(xpath="//a[@href='#/login']")
    WebElement loginbutton;
    @FindBy(xpath="//input[@name='email']")
    WebElement email;
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    @FindBy(xpath="//button[contains(text(),'Login')]")
    WebElement login_btn;
//    @FindBy(xpath="//div[contains(text(),'Thamizhini Athiappan')]")
//    WebElement validcheck;
    @FindBy(xpath="//li[contains(text(),'Wrong email/password combination')]")
    WebElement invalidcheck;
    
    public LoginValidationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    public void login() {
    	loginbutton.click();
    }
    
    public WebElement validUserName(WebDriver driver,String userName) {
    	WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'"+userName+"')]"));
    	return ele;
    }
    
    public void inValidLoginTest(String strmail,String strpassword) {
  	  email.sendKeys(strmail);
  	  password.sendKeys(strpassword);
  	  login_btn.click();
  	}
    public void validLoginTest(String strmail,String strpassword) {
           email.clear();
   	       email.sendKeys(strmail);
   	       password.clear();
    	   password.sendKeys(strpassword);
    	   login_btn.click();
    	}
   public String checkValidLogin(WebElement ele) {
    	 return ele.getText() ;
    }
 
   public String checkInValidLogin() {
	   return invalidcheck.getText();
   }
 
}