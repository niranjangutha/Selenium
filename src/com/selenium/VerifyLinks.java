package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("wikipedia.or"))
		{
			System.out.println("1st url is an internal link-passed");
		}
		else
		{
			System.out.println("1st url in not an innternal link");
		}
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		if(!(url1.contains("wikipedia.or")))
		{
			System.out.println("2nd url is an external link-passed");
		}
		else
		{
			System.out.println("2nd url in not an external link");
		}
	
		
		driver.close();
		
		
	}

}
