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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 //
/*
 * Attach Screenshots to the extent report
 * Test Level
 * Log Level
 */
public class ExtendsReport9 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		extentreport
		.createTest("ScreenShot","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message");
	
		extentreport.flush();
		
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
	
	
	
}
		
		
		
		
		
		
