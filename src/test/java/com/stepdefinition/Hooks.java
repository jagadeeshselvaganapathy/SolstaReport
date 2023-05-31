package com.stepdefinition;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.sikuli.script.Screen;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	
	@After
	
	public void attachScreenShot(Scenario scenario) {
		
		
		 
		if (scenario.isFailed()) {
			System.out.println("yes");
			Screen screen = new Screen();
			String save = screen.capture().save("C:\\Users\\DCKLP-072\\eclipse-workspace3\\SolstaP_01\\test-output");
			
		//	TakesScreenshot ts = (TakesScreenshot)driver;
		//	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		//	scenario.attach(src, "image/png", "screenshot");
			
		//	screen.capture().save("C:\\Users\\DCKLP-072\\eclipse-workspace3\\SolstaP_01\\test-output\\failed_step.png");
	    //     System.out.println("Screenshot captured.");

			
			
		}
		
		
		
	}
	

}
