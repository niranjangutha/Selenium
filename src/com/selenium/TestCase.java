package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		// handling exceptions using try catch block
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		
		
		
		
		
//		try {
//		boolean element=driver.findElement(By.linkText("gmail")).isDisplayed();
//		if(element== true)
//		{
//			System.out.println("gmail elamenet existance in google page-- pass");
//		}
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println(e);
//			System.out.println("gmail elamenet not existance in google page-- fail");
//		}
		
		
		
		
		
		driver.close();
		
	}

}
