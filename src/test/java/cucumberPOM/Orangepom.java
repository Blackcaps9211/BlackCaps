package cucumberPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Orangepom {
	WebDriver driver;

	public  Orangepom (WebDriver d) {
	

		this.driver = d;
		
		PageFactory.initElements(driver, this);
	}
	
	
//	By username = By.xpath("//input[@name='username']");
//	By password = By.xpath("//input[@type='password']");
//	By clickonlogin = By.xpath("//button[@type='submit']");
	
	
	
	@FindBy(how=How.XPATH,using ="//input[@name='username']")
	WebElement UserName;
	
	@FindBy(how=How.XPATH,using ="//input[@type='password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	WebElement LoginButton;
	
	
	
	
	//@FindBy(how=How.CLASS_NAME,using = "oxd-main-menu-item active")
	//WebElement PIM;
	
	
	
//	public void UserName() {
//		driver.findElement(username).sendKeys("Admin");
//		
//	}
//
//public void enterPassword() {
//	driver.findElement(password).sendKeys("admin123");
//	}
//
//public void clickonLogin() {
//	driver.findElement(clickonlogin).click();
//}
	
//public void clickOnPIM() {
//	PIM.click();
// }
	

	
	
	
	public void userName() {
		
		UserName.sendKeys("Admin");
	}
	
public void enterPassword() {
		
	Password.sendKeys("admin123");
	}
	
public void clickonLogin() {
	
	LoginButton.click();
}	
	
	
	
	
	
	
}

