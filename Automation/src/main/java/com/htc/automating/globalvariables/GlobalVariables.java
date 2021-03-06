package com.htc.automating.globalvariables;

public class GlobalVariables {
	//<-------------chrome and firefox drivers path-------------------->
	public static final String CHROME_DRIVER="webdriver.chrome.driver";
	
	public static final String CHROME_DRIVER_PATH="./src/main/resources/chromedriver_win32/chromedriver.exe";
	
	public static final String GECKO_DRIVER = "webdriver.gecko.driver";
	
	public static final String GECKO_DRIVER_PATH ="./src/main/resources/geckodriver-v0.29.0-win64/geckodriver.exe";
	
	//<--------------xlfile sheet_name and location--------------------->
	public static final String XL_INPUT_PATH="./src/main/resources/userlogindetails2.xlsx";
	
	public static final String SHEET_NAME="userlogs";
	
	//<---------------Paths for HTML Reports and Screenshots---------------->
	public static final String HTML_REPORT_PATH= "./src/test/resources";
	
	public static final String REPORT_SCREENSHOT_PATH="./src/test/resources/screenshots/failledtestsscreenshots/";
	
	public static final String SCREENSHOT_PATH="./src/test/resources/screenshots/passedtestsscreenshots/";
	
	//<------------------Madison Island Website Url---------------------->
	public static final String URL="http://demo-store.seleniumacademy.com/";
	
	//<-----------------Default timeout for for all waits----------------------->
	public static final long TIMEOUT_TIME = 50;
		
}
