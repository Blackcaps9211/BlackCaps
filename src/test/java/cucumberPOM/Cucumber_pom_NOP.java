package cucumberPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cucumber_pom_NOP {
	
	WebDriver driver;
public Cucumber_pom_NOP(WebDriver d) {
this.driver = d;
PageFactory.initElements(driver, this);
	
}

   @FindBy(how = How.ID,using ="Email")
      WebElement emailID;

   @FindBy(how = How.ID,using ="Password")
   WebElement PWD;

   @FindBy(how = How.XPATH,using ="//button[@type='submit']")
   WebElement clickBtn;

public void enterEmail()  {
	emailID.clear();
	emailID.sendKeys("admin@yourstore.com");
}

public void enterPassWord() {
	PWD.clear();
	PWD.sendKeys("admin");
}

public void clickOnLoginButton() {
	clickBtn.click();
}
















}
