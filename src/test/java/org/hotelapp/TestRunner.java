package org.hotelapp;

import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import StepDefinition.CustomizedReport;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\CucumberDemoPractice\\src\\test\\resources\\HotelApp.feature",
glue="StepDefinition",
monochrome=true,
dryRun=false,
//plugin="json:C:\\Users\\Admin\\eclipse-workspace\\CucumberDemoPractice\\src\\main\\resources\\Reports\\sample.json"
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class TestRunner {

	@AfterClass
	public static void callingReport() throws FileNotFoundException {
		CustomizedReport.jsonToHTML("C:\\Users\\Admin\\eclipse-workspace\\CucumberDemoPractice\\src\\main\\resources\\Reports\\sample.json");
	}
}
