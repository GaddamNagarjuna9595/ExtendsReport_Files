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
import com.aventstack.extentreports.reporter.configuration.ViewConfigurer;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ExtendsReport18 {
	/*
	 * Remove/Change the Order of the Tabs In Extent Report
	 */

	
	public static void main(String[] args) throws IOException {
		
	
		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);
		spartreporter.viewConfigurer().viewOrder().as(new ViewName[] {
				ViewName.TEST,
				ViewName.EXCEPTION,
				ViewName.CATEGORY,
				ViewName.DEVICE,
				ViewName.DASHBOARD
		}).apply();
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
