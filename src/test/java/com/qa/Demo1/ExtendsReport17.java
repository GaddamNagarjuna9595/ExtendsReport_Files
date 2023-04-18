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
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtendsReport17 {
	/*
	 * Add The System/Environment Information to Extent Report
	 * Name           value
	 * OS             Windows10
	 * RAM            8GB
	 * ROM            500GB
	 * Browser        chrome
	 * App URL        hyrtutorials.com
	 */

	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
		System.out.println(capabilities.getBrowserName());
		System.out.println(capabilities.getVersion());
		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		
		
		extentreport.attachReporter(spartreporter);
		extentreport.setSystemInfo("OS", System.getProperty("os.name"));
		extentreport.setSystemInfo("Java Version", System.getProperty("java.version"));
		extentreport.setSystemInfo("Browser", capabilities.getBrowserName() + capabilities.getVersion());
		extentreport.setSystemInfo("App URL", "https://www.google.com/");
		extentreport.setSystemInfo("User Nane", "gaddamnagarjuna@gmail.com");
		extentreport.setSystemInfo("Password", "gaddam@123");
		
		
		extentreport.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
