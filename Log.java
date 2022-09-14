package org.magnitia.selenium.gcreddy.batchNo33_Reports;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	
	// define the logger variable
	// any variable which your are defying or any method you are using.. all must be static variables and static methods only
	
	public static Logger logger = Logger.getLogger(Log.class.getName());
	
	
	public static void startTest(String TestCaseName) {
		// configure the Log4j.xml
		DOMConfigurator.configure("Log4j.xml");
		logger.info("                                                                           ");
		logger.info(" ------------------- "+  TestCaseName    +"   -----------------------------");
		logger.info("____________________________________________________________________________");		
	}
	//---------------------------------------------------------
	public static void info(String message) {
		logger.info(message);
	}
	//--------------------------------------------------------
	public static void pass(String message) {
		logger.info(message);
	}
	//------------------------------------------------------
	public static void fail(String message) {
		logger.error(message);
	}
	//------------------------------------------------------
	public static void warn(String message) {
		logger.warn(message);
	}
	//-------------------------------------------------------
	public static void fatal(String message) {
		logger.fatal(message);
	}
	//-------------------------------------------------------
	public static void endTest() {
		logger.info("#############################################################################");
	}
	

}
