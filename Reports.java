package org.magnitia.selenium.gcreddy.batchNo33_Reports;

import java.util.HashMap;
import java.util.Map;

import org.magnitia.selenium.gcreddy.batchNo33_Constants.Constant;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	public static ExtentReports reports = new ExtentReports(Constant.ReportsPath,false);
	public static ExtentTest test;
	// starttext and endTest
	//info, pass, fail, warn, fatal
	//--------------------------------------------------------
	public static void startTest(String testcasename, String description) {
		 test = reports.startTest(testcasename, description);
		 addSystemInfo();
		 test.assignCategory("Smoke");
		 test.assignAuthor("Lalima");
	}
	//-------------------------------------------------------
	public static void addSystemInfo() {
	Map<String, String>sysInfo = new HashMap<String, String>();
		sysInfo.put("Selenium version", "3.141.0");
		reports.addSystemInfo(sysInfo);
	}
	//---------------------------------------------------------
	
	public static void info(String stepname, String details) {
		test.log(LogStatus.INFO, stepname, details);
		
	}
	//--------------------------------------------------------
	public static void pass(String stepname, String details) {
		test.log(LogStatus.PASS, stepname, details);
		
	}
    //---------------------------------------------------------------
	public static void fail(String stepname, String details, String imagePath) {
		test.log(LogStatus.FAIL, stepname,"<span style='font-Weight:italic; color:Red'>"+ details+"</span>" + test.addScreenCapture(imagePath));
		
	}
	//-----------------------------------------------------------------
	public static void warn(String stepname, String details) {
		test.log(LogStatus.WARNING, stepname, "<span style ='font-Weight:Bold; color:yellow'>"+ details+"</span>");	
	}
	//-------------------------------------------------------------------------------
	public static void fatal(String stepname, String details) {
		test.log(LogStatus.FATAL, stepname,details);
	}
	//---------------------------------------------------------------------------------
	public static void endTest() {
		reports.endTest(test);
	}
	//--------------------------------------------
	public static void flush() {
		reports.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
