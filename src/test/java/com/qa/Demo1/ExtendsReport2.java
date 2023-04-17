package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// visit this website - https://mvnrepository.com/artifact/com.aventstack/extentreports
public class ExtendsReport2 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		ExtentTest test=extentreport.createTest("Test1");
		test.log(Status.PASS, "this is Pass");

		ExtentTest test2=extentreport.createTest("Test2");
		test2.fail("this is fail");


		extentreport.createTest("Test3").skip("This Is skip");


		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
}
