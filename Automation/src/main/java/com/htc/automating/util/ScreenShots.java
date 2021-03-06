package com.htc.automating.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.htc.automating.globalvariables.GlobalVariables;
import com.htc.reports.ExtentTestReport;

public class ScreenShots {
	private WebDriver driver;
	TakesScreenshot tss;
	File srcfile,destfile;
	String timestamp= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	
	public ScreenShots(WebDriver driver) {
		this.driver=driver;
	}
	
	public void capturingScreenShot() throws NullPointerException {		
		try {
			tss=(TakesScreenshot)driver;
			srcfile=tss.getScreenshotAs(OutputType.FILE);
			destfile= new File(GlobalVariables.SCREENSHOT_PATH+"Test "+timestamp+".png");
			Thread.sleep(5000);
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addingScreenshotToReport() throws NullPointerException{
		try {
			tss=(TakesScreenshot)driver;
			srcfile=tss.getScreenshotAs(OutputType.FILE);
			destfile= new File(GlobalVariables.REPORT_SCREENSHOT_PATH+"Test "+timestamp+".png");
			Thread.sleep(5000);
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ExtentTestReport.getTest().fail("Screenshot",MediaEntityBuilder.createScreenCaptureFromPath(GlobalVariables.HTML_REPORT_PATH).build());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
