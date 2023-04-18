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
 
public class ExtendsReport16 {
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

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
//		System.out.println(capabilities.getBrowserName());
//		System.out.println(capabilities.getVersion());
//		driver.quit();
		
		
//		System.getProperties().list(System.out);
		
		
		
		System.out.println(System.getProperty("os.name"));
		System.out.println("Java"+System.getProperty("java.version"));
		
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
