package blackCaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageforHRM {

	
	WebDriver driver;

	public  LoginPageforHRM (WebDriver d) {
	

		this.driver = d;
		
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how=How.XPATH,using ="//input[@name='username']")
	WebElement UserName;
	
	@FindBy(how=How.XPATH,using ="//input[@type='password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(how=How.XPATH,using = "//h6[text()='Dashboard']")
	WebElement Dashboard;
	
	
	
public void enterUserName() {
		
		UserName.sendKeys("Admin");
	}
	
public void enterPassword() {
		
	Password.sendKeys("admin123");
	}
	
public void clickonLogin() {
	
	LoginButton.click();
}
	
public void verifyDshboard() {
boolean dashbord = Dashboard.isDisplayed();
System.out.println("User sucessfully landed on dashboard page:" +dashbord);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
