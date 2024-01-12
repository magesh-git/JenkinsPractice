package org.hotelapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	Properties prop;
	
	public void browserLaunch() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\org\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		//String urlName = prop.getProperty("url");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get(urlName);
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			//driver.get(urlName);
		}
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void sendKeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	
    public void select(WebElement element, String text) {
    	Select s = new Select(element);
    	s.selectByValue(text);
    }
    
    public String excelRead(int rowNumber, int columnNumber) throws IOException {
    	
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/TestData.xlsx");
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet = wb.getSheet("Sheet1");
    	XSSFRow row = sheet.getRow(rowNumber);
    	XSSFCell cell = row.getCell(columnNumber);
    	DataFormatter formatter = new DataFormatter();
    	String cellValue = formatter.formatCellValue(cell);
    	wb.close();
    	return cellValue;
    }
    
    public void alertAccept() {
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    }
}
