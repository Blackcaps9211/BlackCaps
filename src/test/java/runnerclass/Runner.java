package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "C:\\Users\\hp\\cucumberWork\\src\\test\\resources\\Features\\Add a new cuctomer.feature",

//		features = "C:\\Users\\hp\\cucumberWork\\src\\test\\resources\\Features\\LoginOrangePom.feature",
		
		features ="C:\\Users\\hp\\cucumberWork\\src\\test\\resources\\Features\\Create_and_Search_An_Employee.feature",

		glue = { "StepDefination" },
		plugin = {"pretty", "html:target/My_reports.html"}

)

public class Runner {

}
  