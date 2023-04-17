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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
 //
/*
 * Attach Screenshots to the extent report
 * Test Level
 * Log Level
 */
public class ExtendsReport11 {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		
		ExtentReports extentreport = new ExtentReports();
		File file = new File("ramcharan.html");
		ExtentSparkReporter spartreporter= new ExtentSparkReporter(file);
		extentreport.attachReporter(spartreporter);

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/home.php");
		String basee64Code = CaptureScreenshot();
		String path = CaptureScreenshot("Faceebook.jpg");
		
		extentreport
		.createTest("ScreenShot page1","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.addScreenCaptureFromBase64String(basee64Code);
		
		extentreport
		.createTest("ScreenShot page2","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.addScreenCaptureFromBase64String(basee64Code,"Facebook home page");
		
		extentreport
		.createTest("ScreenShot page3","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.addScreenCaptureFromPath(path);
		
		extentreport
		.createTest("ScreenShot page4","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.addScreenCaptureFromPath(path,"Facebook home page");
		
		extentreport
		.createTest("ScreenShot page5","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(basee64Code).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(basee64Code, "Facebbok error").build());
		
		
		extentreport
		.createTest("ScreenShot page6","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path, "Facebbok error").build());
		
		extentreport
		.createTest("ScreenShot page7","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.fail("this is a info msg",MediaEntityBuilder.createScreenCaptureFromBase64String(basee64Code).build())
		.fail("this is a info msg",MediaEntityBuilder.createScreenCaptureFromBase64String(basee64Code, "Facebbok error").build());
		
		
		extentreport
		.createTest("ScreenShot page8","This Is A Attaching a Screenshot to the Test At test level")
		.info("this is a Info message")
		.fail("this is a info msg",MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail("this is a info msg",MediaEntityBuilder.createScreenCaptureFromPath(path, "Facebbok error").build());
		
	
		extentreport.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("ramcharan.html").toURI());
		
		
	}
	public static String CaptureScreenshot() {
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String bese64code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved successfully");
		return bese64code;
	}
		
	public static String CaptureScreenshot(String filename) {
		
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./RamCharanScreenShot/"+ filename);
		
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	    return  destFile.getAbsolutePath();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
