package Homework_11_9_2023;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extend_report {
	static ExtentTest test;
	static ExtentReports extent;
	ITestResult result;
	ExtentHtmlReporter htmlReporter;
	
	public void extend_setup() {
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\shupatil\\Downloads\\IphonePrice.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Simple Automation Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	public void pass_result() {
		 test = extent.createTest("Price is same in both pages");
	}
	public void fail_result() {
		test = extent.createTest("Price is not same ");
	}
	
	
	
	public void callFlush() {
		extent.flush();
	}

	public void setpasslog(ITestResult result) {
		this.result = result;
		// TODO Auto-generated method stub
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getThrowable());
		}else if(result.getStatus() == ITestResult.SUCCESS){
			test.log(Status.PASS, result.getName());
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, result.getName());
		}
	}
	
	
}
