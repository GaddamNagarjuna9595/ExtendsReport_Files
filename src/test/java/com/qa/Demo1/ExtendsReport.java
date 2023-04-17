package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// visit this website - https://mvnrepository.com/artifact/com.aventstack/extentreports
public class ExtendsReport {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);
		
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
}
