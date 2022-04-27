package com.demoblaze.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	Logger log;
	String testName;
	String testMethodName;
	
	
	public void onTestStart(ITestResult result) {
		this.testMethodName = result.getMethod().getMethodName();
		log.info("[Starting " + testMethodName + "]");

	}

	public void onTestSuccess(ITestResult result) {
		log.info("[Test " + testMethodName + " passed]");

	}

	public void onTestFailure(ITestResult result) {
		log.info("[Test " + testMethodName + " failed]");

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		this.testName = context.getCurrentXmlTest().getName();
		this.log = LogManager.getLogger(testName);
		log.info("[TEST  STARTED]");

	}

	public void onFinish(ITestContext context) {
		log.info("[ALL  finished]");

	}

}
