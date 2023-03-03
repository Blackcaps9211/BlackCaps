package blackCaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Add_An_Employee {
	
	WebDriver driver;
	public Add_An_Employee(WebDriver d) {
this.driver = d;
PageFactory.initElements(driver, this);

}

	@FindBy(how=How.XPATH,using = "//span[text()='PIM']")
	WebElement PIM;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add Employee']")
	WebElement AddEmployee;
	
	@FindBy(how=How.NAME,using = "firstName")
	WebElement FristName;
	
	@FindBy(how=How.NAME,using = "middleName")
	WebElement MidileName;
	
	@FindBy(how=How.NAME,using = "lastName")
	WebElement LastName;
	
	@FindBy(how=How.XPATH,using = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement ClickOnCreateLoginDetails;
	
	@FindBy(how=How.XPATH,using = "(//input[@autocomplete='off'])[1]")
	WebElement UserName;
	
	@FindBy(how=How.XPATH,using = "(//input[@type='password'])[1]")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using = "(//input[@type='password'])[last()]")
	WebElement ConfirmPassword;
	
	@FindBy(how=How.XPATH,using = "//button[@type='submit']")
	WebElement ClickOnSaveButton;
	
	
	public void clickOnPIM() {
		
		PIM.click();
	}
	
public void clickOnAddEmployee() {
		
	AddEmployee.click();
	}

public void enterFristName() {
	
	FristName.sendKeys("Sree");
}

public void enterMidileName() {
	
	MidileName.sendKeys("Padma");
}

public void enterLastName() {
	
	LastName.sendKeys("Kalluri");

}

public void clickOnCreateLoginDetails() {
	
	ClickOnCreateLoginDetails.click();
}

public void enterUserName() {
	
	UserName.sendKeys("Padma Kalluri");
}

public void enterPassword() {
	
	Password.sendKeys("Padma@0987");
}

public void enterConfirmPassword() {
	
	ConfirmPassword.sendKeys("Padma@0987");
}

public void clickOnSaveButton() {
	
	ClickOnSaveButton.click();
}











}