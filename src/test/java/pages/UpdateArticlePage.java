package pages;

import java.time.Duration;import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdateArticlePage {
	    @FindBy(xpath="(//a[contains(text(),' Edit Article')])[1]")
	    WebElement editButton;
	    @FindBy(xpath="//input[@placeholder='Article Title']")
	    WebElement articleTitle;
	    @FindBy(xpath="//input[@class='form-control ' and @name='description']")
	    WebElement articleAbout;
	    @FindBy(xpath="//textArea[@placeholder='Write your article (in markdown)']")
	    WebElement textArea;
	    @FindBy(xpath="//input[@placeholder='Enter tags']")
	    WebElement enterTags;
	    @FindBy(xpath="//button[contains(text(),'Update Article')]")
	    WebElement update_btn;
	    @FindBy(xpath = "(//a[@class='author'])[1]")
   	    WebElement profileIcon;
	     

	     public WebElement articleTitleElement(WebDriver driver,String articleTitle) {
	    	 WebElement articleTit=driver.findElement(By.xpath("//h1[contains(text(),'"+articleTitle+"')]"));
	    	 return articleTit;
	     }
	     
	     public WebElement getUpdateArticleElement(WebDriver driver,String articleTitle) {
	    	 WebElement updArticleTit=driver.findElement(By.xpath("//h1[contains(text(),'"+articleTitle+"')]"));
	    	 return updArticleTit;
	     }
	     
	     public  UpdateArticlePage(WebDriver driver) {
	    	 PageFactory.initElements(driver,this);
	     }
	     
	     public void profile() {
	    	 profileIcon.click();
	     }
	     
		public void update(WebElement element,String article_Title,String article_About,String textInArticle,String tagsInArticle) {
			     element.click();
			     editButton.click();
		    	 articleTitle.clear();
		    	 articleTitle.sendKeys(article_Title);
		    	 articleAbout.clear();
		    	 articleAbout.sendKeys(article_About);
		    	 textArea.clear();
		    	 textArea.sendKeys(textInArticle);
		    	 enterTags.clear();
		    	 enterTags.sendKeys(tagsInArticle);
		    	 update_btn.click();
	   }
		
		public String updateArticleValidate(WebElement updcheck) {
			return updcheck.getText();
		}
}