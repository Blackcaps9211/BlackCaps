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

public class NopLogin_By_Outline {
WebDriver driver;	
	
@Given("launch The N_browser")
public void launch_the_n_browser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	
}

@When("enter values of {string} and {string}")
public void enter_values_of_and(String un, String pwd) {

	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys(un);

	driver.findElement(By.id("Password")).clear();
	driver.findElement(By.id("Password")).sendKeys(pwd);

}

@Then("click On Submit")
public void click_on_submit() {

	driver.findElement(By.xpath("//button[@type='submit']")).click();

}	
	
	
	
	

}
