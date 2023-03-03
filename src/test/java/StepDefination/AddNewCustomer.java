package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNewCustomer {

	WebDriver driver;

	@Given("Setup the browser")
	public void Setup_The_browser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}

	@When("Enter valid username and password")
	public void Enter_valid_username_and_password() {
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

	}

	@When("click on login")
	public void click_on_login() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("verify Login successfull or not")
	public void verify_login_successfull_or_not() {
		System.out.println("login is successfull");
		
	}

	@When("click on the customers module")
	public void click_on_the_customers_module() {
		
		driver.findElement(By.xpath("//*[contains(text(),'Customers')][1]")).click();
	}

	@And("click on the customers functionality")
	public void click_on_the_customers_functionality() {
		driver.findElement(By.xpath("//*[contains(text(),' Customers')][1]")).click();

		
	}

	@Then("verify the customers page is loaded or not")
	public void verify_the_customers_page_is_loaded_or_not() {

		System.out.println("customers page loaded");
	}

	@When("click on AddNew button")
	public void click_on_add_new_button() {

		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

	}

	@Then("verify the Add new cuctomer page isloaded or not")
	public void verify_the_add_new_cuctomer_page_isloaded_or_not() {
	System.out.println("Add new customer page is loaded");
		
	}

	@When("Enter the customer info")
	public void enter_the_customer_info() {

		driver.findElement(By.id("Email")).sendKeys("veeru@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("anji@1234");
	driver.findElement(By.id("FirstName")).sendKeys("veeru");
	driver.findElement(By.id("LastName")).sendKeys("anji");

		
	}

	@When("click on save button")
	public void click_on_save_button() {

		driver.findElement(By.xpath("//button[@name='save']")).click();
	}

	@Then("verify New customer Added or not")
	public void verify_new_customer_added_or_not() {

		System.out.println("Customer added");
	}


	
	
	
}
