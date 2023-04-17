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
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 //Log Different type of information Extent reports
/*
 * Collection Data (list, set and map) 
 */
public class ExtendsReport7 {

	public static void main(String[] args) throws IOException {

		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		List<String> Data = new ArrayList<>();
		
		Data.add("sreekanth");
		Data.add("Nagarjuna");
		Data.add("Avanish");
		Data.add("OM Sai Ram");
		
		Map<Integer,String> mapData = new HashMap<>();
		mapData.put(101,"sreekanth");
		mapData.put(102,"Nagarjuna");
		mapData.put(103,"Avanish");
		
		Set<Integer> setdata =  mapData.keySet();
		
		extentreport
		.createTest("list based test")
		.info(MarkupHelper.createOrderedList(Data))
		.info(MarkupHelper.createUnorderedList(Data));
		
		extentreport
		.createTest("map based test")
		.info(MarkupHelper.createOrderedList(mapData))
		.info(MarkupHelper.createUnorderedList(mapData));
		
		
		extentreport
		.createTest("set based test")
		.info(MarkupHelper.createOrderedList(setdata))
		.info(MarkupHelper.createUnorderedList(setdata));
		
		
		
		
		
		extentreport.flush();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
	}
}
