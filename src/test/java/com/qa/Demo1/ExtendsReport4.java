package com.qa.Demo1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 //Log Different type of information Extent reports
/*
 * Text Bold,Italic
 * XML
 * JSon
 * Collection Data (list, set and map)
 * Highlight any message
 * exception
 * 
 * 
 * visit the website-----https://www.w3schools.com/html/html_formatting.asp
 */
public class ExtendsReport4 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		extentreport
		.createTest("Test1")
		.log(Status.INFO,"Info Message")
		.log(Status.PASS,"<b>pass Message</b>")
		.log(Status.SKIP,"<i>skip Message</i>")
		.log(Status.WARNING,"<b><i>warning Message</b></i>")
		.log(Status.FAIL,"<p>Do not forget to buy <mark>milk</mark> today.</p>");

		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
}
