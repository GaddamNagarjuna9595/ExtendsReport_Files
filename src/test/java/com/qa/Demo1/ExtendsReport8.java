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
 //Log Different type of information Extent reports
/*
 * Highlight any message
 * exception 
 */
public class ExtendsReport8 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		extentreport
		.createTest("HighlAte Log Test")
		.info("THis is Not A Higlate Message")
		.info(MarkupHelper.createLabel("This is a Highlate Message", ExtentColor.ORANGE));
		
		
		try {
			int i=5/0;
			
		} catch (Exception e) {
		extentreport.createTest("Expetion Test")
		.info(e);
		}
		
		Throwable t=new RuntimeException("This is a  Srikanth Expection");
				extentreport.createTest("Expetion Test1")
				.pass(t);
		
		
		
		
		extentreport.flush();
		
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
		
		
		
}
