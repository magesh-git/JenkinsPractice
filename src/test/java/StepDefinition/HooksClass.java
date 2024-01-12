package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.hotelapp.BaseClass;
import org.openqa.selenium.OutputType;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;

public class HooksClass extends BaseClass{

	@Before
	public void launchBrowser() throws IOException {
		browserLaunch();
	}
	
	@AfterStep
	public void tearDown(Scenario scenario) throws IOException, InterruptedException {
		
		if(scenario.isFailed()) 
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		//FileUtils.copyFile(source, new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberDemoPractice\\src\\main\\resources\\ScreenShot\\failed.png"));
		scenario.attach(source, "image/png", scenario.getName());
		//driver.close();
	}
}
}
