package com.vdb.qa.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
		
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String repName="Test-Report-"+timeStamp+".html";
		
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);//specify location of the report
		//htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environemnt","Stage");
		extent.setSystemInfo("user","ravi");
		
		htmlReporter.config().setDocumentTitle("VDB"); // Tile of report
		htmlReporter.config().setReportName("Regression Test Automation Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); // create new entry in report
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed information to the report with GREEN color highlighted
	}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); // create new entry in report
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted
		logger.log(Status.FAIL, tr.getThrowable());
//		String screenshotPath=System.getProperty("user.dir")+"/screenshots/"+tr.getMethod().getMethodName()+".png";
//		//System.out.println(screenshotPath);
//		
//		File f = new File(screenshotPath); 
//		  
//		if(f.exists())
//		{
//		try {
//			logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath, "ScreenCapture"));
//			} 
//		catch (IOException e) 
//				{
//				e.printStackTrace();
//				}
//		}
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); // create new entry in report
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
		logger.log(Status.SKIP, tr.getThrowable());
	}
	
	
	
	public void onFinish(ITestContext testContext)
	{
//		int failedCount = testContext.getFailedTests().size();
//      	System.out.println(failedCount);
//      	
//		Collection<ITestNGMethod> failedMethod = testContext.getFailedTests().getAllMethods();
//		System.out.println(failedMethod);
//		
//		for (Iterator<ITestResult> iterator = testContext.getFailedTests().getAllResults().iterator(); iterator.hasNext(); ) {
//			{
//				System.out.println(failedMethod);
//			}
		extent.flush();
	}
	
	
	
	}	
	


