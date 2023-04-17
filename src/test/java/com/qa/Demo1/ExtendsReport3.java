package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//Understand the log levels in extent Reports
/*
 * fail
 * skip
 * warning
 * pass
 * info
 * 
 */
public class ExtendsReport3 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		extentreport
		.createTest("Test1")
		.log(Status.INFO , "info1")
		.log(Status.INFO , "info2")
		.log(Status.FAIL , "fail1")
		.log(Status.FAIL , "fail2")
		.log(Status.SKIP , "skip1")
		.log(Status.SKIP , "skip2")
		.log(Status.WARNING , "warning1")
		.log(Status.WARNING , "warning1")
		.log(Status.PASS , "pass1")
		.log(Status.PASS , "pass2");

		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
}
