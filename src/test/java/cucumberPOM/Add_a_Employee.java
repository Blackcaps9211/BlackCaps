package cucumberPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_a_Employee {
	
	WebDriver driver;
	
	public Add_a_Employee(WebDriver d) {
	this.driver = d;
	PageFactory.initElements(driver, this);
	}

	By clickonPIM = By.xpath("//span[text()='PIM']");
	
	By clickonAddEmp = By.xpath("//a[text()='Add Employee']");
	
//	By clickOnAdmin = By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]");
	
	By Fristname = By.name("firstName");
	By Midilename = By.name("middleName");
	By Lastname = By.name("lastName");
	By ClickOnCheckBox = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	By Username = By.xpath("(//input[@autocomplete='off'])[1]");
	By Password = By.xpath("(//input[@type='password'])[1]");
	By ConfirmPassword = By.xpath("(//input[@type='password'])[last()]");
	By ClickonSaveButton = By.xpath("//button[@type='submit']");
	
	
	By clickOnEmployeeList = By.xpath("//a[text()='Employee List']");
	By EmployeeName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	By EmployeeId = By.xpath("(//input[@class='oxd-input oxd-input--active'])[last()]");
	By ClickOnSearchButton = By.xpath("//button[@type='submit']");
	
	
	
	
	
	
	public void clickonPIMmodule() {
		
		driver.findElement(clickonPIM).click();
	}
	
	public void addEmp() {
		
		driver.findElement(clickonAddEmp).click();
	}
	
	
	
	
public void fristName() {
		
		driver.findElement(Fristname).sendKeys("aaaaa");
	}
	

public void midleName() {
	
	driver.findElement(Midilename).sendKeys("bbbbbb");
}

public void lastName() {
	
	driver.findElement(Lastname).sendKeys("ccccccc");
}

public void clickOnCheckBox() {
	
	driver.findElement(ClickOnCheckBox).click();
}

public void userName() {
	
	driver.findElement(Username).sendKeys("kkkkk");
}

public void enterPassword() {
	
	driver.findElement(Password).sendKeys("KVee@123456");
}

public void confirmPassword() {
	
	driver.findElement(ConfirmPassword).sendKeys("KVee@123456");
}

public void clickSaveButton() {
	
	driver.findElement(ClickonSaveButton).click();
}

public void clickOnEmployeeList() {

		driver.findElement(clickOnEmployeeList).click();
	 }	
	
	
public void employeeName() {

	driver.findElement(EmployeeName).sendKeys("aaaaa ccccccc");
 }		
	
	
public void employeeId() {

	driver.findElement(EmployeeId).sendKeys("0346");
 }		
	
public void clickOnSearchButton() {

	driver.findElement(ClickOnSearchButton).click();
 }	
	
	
	
	
}
