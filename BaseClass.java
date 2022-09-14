package org.magnitia.selenium.gcreddy.batchNo33_BaseClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.magnitia.selenium.gcreddy.batchNo33_Constants.Constant;
import org.magnitia.selenium.gcreddy.batchNo33_Reports.Log;
import org.magnitia.selenium.gcreddy.batchNo33_Reports.Reports;
import org.magnitia.selenium.gcreddy.batchNo33_Utilities.ExcelUtils;
import org.magnitia.selenium.gcreddy.batchNo33_Utilities.Utility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

//import jdk.internal.org.jline.utils.Log;

public class BaseClass {

	public static Properties prop_config;
	public static Properties prop_loct;

	@BeforeSuite
	public void intiliaseFiles() throws IOException {
		DOMConfigurator.configure("Log4j.xml");
		System.out.println("HI.....pre");
		prop_config = Utility.loadProperty(Constant.config_path);
		
		prop_loct = Utility.loadProperty(Constant.locaters_path);
		System.out.println("HI.....post");
		ExcelUtils.invokeExcel(Constant.TestData_excel_path);
		Log.info("All files are invoked successfully");
	}

	@AfterTest
	public void FLushReports() {
		Reports.flush();
	}

}
