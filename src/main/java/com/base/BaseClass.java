package com.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	
public static WebDriver driver;
	
public static void lanchBrowser() {
	try {
		switch (valueFromProperty("browser")) {
		case "chrome":			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		
			
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}

	public static void loadUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		driver.get(url);
	}
	
	public void navigate(String url) {
		
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		driver.navigate().to(url);
	}

	public void insertText(WebElement element, String text) {
		
		try {
			
			element.sendKeys(text);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		element.sendKeys(text);
		
	}
	

	public void clickButton(WebElement element) {
		
		try {
			element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		element.click();
	}

	public void selectKey(WebElement element1, String text) {
		
		try {
			Select s = new Select(element1);
			s.selectByVisibleText(text);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Select s = new Select(element1);
//		s.selectByVisibleText(text);
	}

	public void txtPrint(WebElement element2) {
		
		try {
			String text = element2.getText();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		String text = element2.getText();
//		return text;
//		return text;
	}
	
	public void scrollTrue(WebElement element) {
		
		try {
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView(false)", element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].scrollIntoView(false)", element);
	 
	}
	
	
	public void sleep(int element) {
		
		try {
			Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(element));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(element));
//		return implicitlyWait;
	}
	
	public void deleteCookies() {
		try {
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
//driver.manage().deleteAllCookies();
	}
	
	public void closeBrowser() {
		try {
			driver.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//driver.close();
	}
	
	public static String valueFromProperty(String key) throws IOException {
		FileReader reader = new FileReader("config.properties");
Properties pro = new Properties();
pro.load(reader);
Object obj = pro.get(key);
String s = (String)obj;
return s;
	}
	
	
	

 
}
