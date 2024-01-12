package StepDefinition;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CustomizedReport {
	
		public static void jsonToHTML(String json) throws FileNotFoundException{
			
			File f =new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberDemoPractice\\src\\main\\resources\\Reports");
			Configuration config = new Configuration(f, "Userdefined report");
			config.addClassifications("Browser", "Chrome");
			config.addClassifications("Platform", "Windows 10");
			config.addClassifications("TesterName", "Magesh");
			config.addClassifications("Sprint ID", "12345");
			
			List<String> ls = new ArrayList<>();
			ls.add(json);
			
			ReportBuilder report = new ReportBuilder(ls,config);
			report.generateReports();
		
	}

}
