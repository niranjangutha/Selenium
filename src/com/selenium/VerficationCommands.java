package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class VerficationCommands {
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "h://chrome//chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("niranjan gutha");
		driver.findElement(By.id("pass")).sendKeys("19032014");
		driver.findElement(By.id("loginbutton")).click();
		//String handle=driver.getWindowHandle();
		//System.out.println(handle);
//		driver.findElement(By.className("_4a0a img sp_0a_2v_vcgG_ sx_fda37f")).click();
//		boolean disp=driver.findElement(By.className("_3-8_ _2ph- _6q3h")).isDisplayed();
//		System.out.println(disp);
//		boolean enab=driver.findElement(By.className("_3-8_ _2ph- _6q3h")).isEnabled();
//		System.out.println(enab);
		
//		try {
//			driver.findElement(By.className("_3-8_ _2ph- _6q3h")).click();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		
//		}
//		driver.findElement(By.xpath("//*[@id=\"js_uh\"]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("jfdhj");
//		Thread.sleep(2000);
//		driver.findElement(By.className("_3-8_ _2ph- _6q3h")).click();
//		Thread.sleep(2000);
		driver.close();
	}

}
