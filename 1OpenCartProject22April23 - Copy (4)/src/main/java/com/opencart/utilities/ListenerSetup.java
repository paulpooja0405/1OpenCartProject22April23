package com.opencart.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase execution started :-"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase execution Passed :-"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase execution failed :-"+ result.getName());
		UtilClass.takeScreenshotOfPage(result.getName());
		System.out.println("take screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase execution skipped :-"+ result.getName());
		
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Testcase execution failed :-"+ result.getName());
		UtilClass.takeScreenshotOfPage(result.getName());
		System.out.println("take screenshot");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
