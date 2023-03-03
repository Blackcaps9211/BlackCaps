package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberLogin {
	
	 
		WebDriver driver;
	
		@Given("lauch the browser")
	public void lauch_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	
	
	}

	@When("enter the username and password")
	public void enter_the_username_and_password() {
	    driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("admin");
	}

	@When("click on lioginButton")
	public void click_on_liogin_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("verify login success or not")
	public void verify_login_success_or_not() {
	   System.out.println("login success");
	 
	}
	

}
