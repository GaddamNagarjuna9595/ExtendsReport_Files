package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtendsReport14 {
	/*
	 * Extent report configuration Using Java,JSON AND XML
	 * 
	 * .Change the theme
	 * .Change the report name
	 * .change the document title
	 * .change the date and time stamp format
	 * Apply the CSS
	 * Run the JavaScript
	 */

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		
		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
//		spartreporter.config().setTheme(Theme.DARK);
//		spartreporter.config().setReportName("Report Name");
//		spartreporter.config().setDocumentTitle("Doc Tile");
//		spartreporter.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
//		spartreporter.config().setCss(".badge-primary{background-color:#da0b2b}");
//		spartreporter.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		
	//	spartreporter.loadJSONConfig(new File("./src/Extent-Reports-Configurations.json"));
		spartreporter.loadXMLConfig(new File("./src/Extent.XML"));
		
		extentreport.attachReporter(spartreporter);
		
		extentreport.createTest("Test1")
		.assignAuthor("Nagarjuna")
		.assignCategory("SaniTy")
		.assignDevice("Edge")
		.pass("This Is Pass");
		
		extentreport.createTest("Test2")
		.assignAuthor("Srikanth")
		.assignCategory("Smoke")
		.assignDevice("chrome 99")
		.pass("This Is Pass");
		
		extentreport.createTest("Test3")
		.assignAuthor("Avinash")
		.assignCategory("Regression")
		.assignDevice("FireFox")
		.pass("This Is Pass");
		
		
		extentreport.createTest("Test4")
		.assignAuthor("Avinash","Chiranjeevi")
		.assignCategory("Regression","Re-Test","Usability")
		.assignDevice("FireFox","Chrome 99")
		.pass("This Is Pass");
	
		
		extentreport.createTest("Test4")
		.assignAuthor("Avinash","Chiranjeevi")
		.assignCategory("Regression","Re-Test","Usability")
		.assignDevice("FireFox","Chrome 99")
		.pass("This Is Pass");
		
		
		extentreport.createTest("Test5","Test Desc")
		.assignAuthor(new String[] {"Avinash","Chiranjeevi"})
		.assignCategory(new String[] {"Regression","Re-Test","Usability"})
		.assignDevice(new String[] {"FireFox","Chrome 99"})
		.pass("This Is Pass");
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
