package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DateSelction {
/*
 * facebook login page id locator are changes for bowser 
 */
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		   
		   driver.findElement(By.xpath("//a[.='Sign up for Facebook']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.id("u_0_l")).sendKeys("Prasanna");
		   Thread.sleep(2000);
		   driver.findElement(By.id("u_0_n")).sendKeys("A R");
		   Thread.sleep(2000);
		   driver.findElement(By.id("u_0_q")).sendKeys("8711013119");
		   Thread.sleep(2000);
		   driver.findElement(By.id("u_0_x")).sendKeys("8711013119");
		   Thread.sleep(2000);
//		   driver.findElement(By.id("")).sendKeys("123abc!@#");
//		   Thread.sleep(2000);
		   driver.findElement(By.id("day")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//option[.='11']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("month")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//option[.='Jul']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("year")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//option[.='2015']")).click();
		  
		   Thread.sleep(2000);
		   
		   driver.findElement(By.id("u_0_l")).click();
		
		

		
		
//		driver.get("file:///H:/first.html");
//		driver.findElement(By.name("languages")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//option[.='java']")).click();
//		Thread.sleep(3000);
//		driver.close();
		

	}

}
