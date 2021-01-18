package com.aswaq.testing;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;


import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void deleteOutputFolder() throws IOException{
		System.out.println("Cleanring the report folder from previous result");
	FileUtils.cleanDirectory(new File("./target/allure-results"));
	


	}
	
	public void Screenshot(WebDriver driver) {
		
		
		
	}
	



}
