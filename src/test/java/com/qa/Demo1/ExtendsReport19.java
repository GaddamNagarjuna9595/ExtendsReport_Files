package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.StatusFilter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewConfigurer;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtendsReport19 {
	/*
	 * Generate the Extent report for only failed/skipped/passes tests
	 */

	
	public static void main(String[] args) throws IOException {
		
	
		
		ExtentReports extentreport = new ExtentReports();
		ExtentSparkReporter spartreporter_all= new ExtentSparkReporter("AllTest.html");
		ExtentSparkReporter spartreporter_failed= new ExtentSparkReporter("FailedTests.html");
		spartreporter_failed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		ExtentSparkReporter spartreporter_skippedandwarning= new ExtentSparkReporter("SkipAndWarningTests.html");
		spartreporter_skippedandwarning.filter().statusFilter().as(new Status[] {
		Status.FAIL}).apply();
		
		extentreport.attachReporter(spartreporter_all,spartreporter_failed,spartreporter_skippedandwarning);
				extentreport.createTest("Test1")
				.assignAuthor("Nagarjuna")
				.assignCategory("SaniTy")
				.assignDevice("Edge")
				.pass("This Is Pass");
				
				extentreport.createTest("Test2")
				.assignAuthor("Srikanth")
				.assignCategory("Smoke")
				.assignDevice("chrome 99")
				.fail("this is fail");
				
				extentreport.createTest("Test3")
				.assignAuthor("Avinash")
				.assignCategory("Regression")
				.assignDevice("FireFox")
				.warning("This is warning");
				
				
				extentreport.createTest("Test4")
				.assignAuthor("Avinash","Chiranjeevi")
				.assignCategory("Regression","Re-Test","Usability")
				.assignDevice("FireFox","Chrome 99")
				.skip("This is skip");
			
				
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
		Desktop.getDesktop().browse(new File("AllTest.html").toURI());
		Desktop.getDesktop().browse(new File("FailedTests.html").toURI());
		Desktop.getDesktop().browse(new File("SkipAndWarningTests.html").toURI());
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
