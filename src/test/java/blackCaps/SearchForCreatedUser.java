package blackCaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchForCreatedUser {
	
	WebDriver driver;
	
	public SearchForCreatedUser(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using ="//a[text()='Employee List']")
	WebElement EmployeeList;
	
	@FindBy(how=How.XPATH, using ="(//input[@placeholder='Type for hints...'])[1]")
	WebElement EmployeeName;
	
	@FindBy(how=How.XPATH, using ="(//input[@class='oxd-input oxd-input--active'])[last()]")
	WebElement EmployeeId;
	
	@FindBy(how=How.XPATH, using ="//button[@type='submit']")
	WebElement ClickOnSearchButton;
	
	@FindBy(how=How.XPATH, using ="(//span[@class='oxd-text oxd-text--span'])[1]")
	WebElement Record;
	
	
	public void clickOnEmployeeList() {
		EmployeeList.click();
	}
	
	public void enterEmployeeName() {
		EmployeeName.sendKeys("Jyothi Chinta");
	}
	
	public void enterEmployeeId() {
		EmployeeId.sendKeys("0278");
	}
	
	public void clickOnSearchButton() {
		ClickOnSearchButton.click();
	}
	
	public void empRecord() {
	boolean record = Record.isDisplayed();
	System.out.println("User record sucessfully founded:" +record);

	}
	
}
