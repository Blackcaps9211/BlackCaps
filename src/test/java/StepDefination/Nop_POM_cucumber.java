package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumberPOM.Cucumber_pom_NOP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Nop_POM_cucumber {
	WebDriver driver;
	
	
	@Given("setUp Browser for Nop_commerce")
	public void set_up_browser_for_nop_commerce() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
	}

	@When("send Email Value")
	public void send_email_value() {
		Cucumber_pom_NOP CPM = new Cucumber_pom_NOP(driver);
		CPM.enterEmail();
	}

	@When("send Password value")
	public void send_password_value() {
		Cucumber_pom_NOP CPM = new Cucumber_pom_NOP(driver);
		CPM.enterPassWord();
	}

	@Then("click on Nop_commerce LoginButton")
	public void click_on_nop_commerce_login_button() {
		Cucumber_pom_NOP CPM = new Cucumber_pom_NOP(driver);
		CPM.clickOnLoginButton();
	
}
	
	
}
