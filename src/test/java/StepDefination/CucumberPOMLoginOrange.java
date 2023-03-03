package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumberPOM.Add_a_Employee;
import cucumberPOM.CucumberPomOrange;
import cucumberPOM.Orangepom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberPOMLoginOrange {
	
	WebDriver driver;
	
	//Orangepom org1 = new Orangepom(driver);
	// Add_a_Employee PIM = new Add_a_Employee(driver);
	
	@Given("setBrowser")
	public void set_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	}

	
	@When("enterUserName")
	public void enter_user_name() {
		
		Orangepom org1 = new Orangepom(driver);
		org1.userName();
	}

	@When("enterPassword")
	public void enter_password() {
		
		Orangepom org1 = new Orangepom(driver);
		org1.enterPassword();
	}

	@Then("clickLogin")
	public void click_login() {
		
		Orangepom org1 = new Orangepom(driver);
		org1.clickonLogin();
	}
	
	@Then("clickOnPIM")
	public void click_on_pim() {
	    
		Add_a_Employee PIM = new Add_a_Employee(driver);
		
		PIM.clickonPIMmodule();
		
	}
	
	@Then("clickOnAddEmployee")
	public void click_on_add_employee() {
		Add_a_Employee PIM = new Add_a_Employee(driver);
		PIM.addEmp();
	}
	
	
	@Then("addNewEmpDetails")
	public void add_new_emp_details() {
		
		
//	    driver.findElement(By.name("firstName")).sendKeys("veeru");
//	    driver.findElement(By.name("middleName")).sendKeys("anji");
//	    driver.findElement(By.name("lastName")).sendKeys("kay");
//	    
//	    
//	    driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
//	   
//	    
//	    driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("kay098");
//		    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Veeru@12345$");
//		    driver.findElement(By.xpath("(//input[@type='password'])[last()]")).sendKeys("Veeru@12345$");
//	    
//	    
//	    
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	   
	   // driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[last()]")).clear();
	   // driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[last()]")).sendKeys("9211");
	    
	//  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   // driver.findElement(By.className("class=\"oxd-switch-input oxd-switch-input--active --label-right\"")).click();
	    
	  //  driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("kay123");
	  //  driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Veeru@12345$");
	   // driver.findElement(By.xpath("(//input[@type='password'])[last()]")).sendKeys("Veeru@12345$");
	    
		Add_a_Employee PIM = new Add_a_Employee(driver);
		
		PIM.fristName();
		PIM.midleName();
		PIM.lastName();
		PIM.clickOnCheckBox();
		PIM.userName();
		PIM.enterPassword();
		PIM.confirmPassword();
		PIM.clickSaveButton();
			
		
	}
	
	
	@Then("clickOnEmployeeList")
	public void click_On_EmployeeList() {
		Add_a_Employee PIM = new Add_a_Employee(driver);
		PIM.clickOnEmployeeList();
	}
	
	
	@Then("Seach created user")
	public void search_Created_User() {
		Add_a_Employee PIM = new Add_a_Employee(driver);
		PIM.employeeName();
		PIM.employeeId();
		PIM.clickOnSearchButton();
	}
	
	

}
