package cucumberPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CucumberPomOrange {
	
	
	WebDriver driver;
	public CucumberPomOrange (WebDriver d) {
	this.driver = d;
	PageFactory.initElements(driver, this);
	
	}
	

//@FindAll({
//		
//		@FindBy(name = "username"),
//		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
//	})
//	WebElement Username;
	
	
	
	@FindBy(how = How.NAME,using = "username")
	
	WebElement name;
	

	
	@FindBy(how = How.NAME,using = "password")
	WebElement pwd;
	
	@FindBy(how = How.XPATH,using="//button[@type='submit']")
	WebElement Login;
	
	public void enterUserName() {
		name.sendKeys("Admin");
	}
	
	public void enterPassword() {
		pwd.sendKeys("admin123");
	}
	
	public void clickOnLogin() {
		Login.click();
	}
	
		
	
}
