package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import blackCaps.Add_An_Employee;
import blackCaps.LoginPageforHRM;
import blackCaps.SearchForCreatedUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_And_Search_an_Employee {
	
	WebDriver driver;
	
	// LoginPageforHRM  LG = new LoginPageforHRM(driver);
	// Add_An_Employee AE = new Add_An_Employee(driver);
	// SearchForCreatedUser SC = new SearchForCreatedUser(driver);

	@Given("launch the Browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	}


	@When("enter UserName")
	public void enter_user_name() {
		LoginPageforHRM  LG = new LoginPageforHRM(driver);
		LG.enterUserName();
	}

	@When("enter Password")
	public void enter_password() {
		LoginPageforHRM  LG = new LoginPageforHRM(driver);
		LG.enterPassword();
	}

	@Then("click On Login")
	public void click_on_login() {
		LoginPageforHRM  LG = new LoginPageforHRM(driver);
	  LG.clickonLogin();
	}

	@Then("verify User Landed On Dashboard Page")
	public void verify_user_landed_on_dashboard_page() {
		LoginPageforHRM  LG = new LoginPageforHRM(driver); 
		LG.verifyDshboard();
	}

	@When("click On PIM Menu")
	public void click_on_pim_menu() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.clickOnPIM();
	}

	@When("click On Add Employee Button")
	public void click_on_add_employee_button() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.clickOnAddEmployee();
	}

	@When("fill The Required details")
	public void fill_the_required_details() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.enterFristName();
		AE.enterMidileName();
		AE.enterLastName();
	}

	@When("click On Create Login Details Checkbox")
	public void click_on_create_login_details_checkbox() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.clickOnCreateLoginDetails();
	}

	@Then("fill Required User Details")
	public void fill_required_user_details() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.enterUserName();
		AE.enterPassword();
		AE.enterConfirmPassword();
	}

	@Then("click On Save Button")
	public void click_on_save_button() {
		Add_An_Employee AE = new Add_An_Employee(driver);
		AE.clickOnSaveButton();
	}

	@Then("click On EmployeeList")
	public void click_on_employee_list() {
		SearchForCreatedUser SC = new SearchForCreatedUser(driver);

		SC.clickOnEmployeeList();
	}

	@Then("search For Created User")
	public void search_for_created_user() {
		SearchForCreatedUser SC = new SearchForCreatedUser(driver);

		SC.enterEmployeeName();
		SC.enterEmployeeId();
		SC.clickOnSearchButton();
	}

	@Then("verify The Results Of Created User")
	public void verify_the_results_of_created_user() {
		SearchForCreatedUser SC = new SearchForCreatedUser(driver);
		SC.empRecord();
	}	
	
		
}
