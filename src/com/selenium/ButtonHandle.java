package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		WebElement button=driver.findElement(By.id("identifierNext"));
		String text=button.getText();
		System.out.println(text);
		String value=button.getAttribute("value");
		System.out.println(value);
		String role=button.getAttribute("class");
		System.out.println(role);
		String tagname=button.getTagName();
		System.out.println(tagname);
		button.click();
	
		
		
		
		
		
		
		
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
//		WebElement button=driver.findElement(By.id("loginbutton"));
//		
//		Thread.sleep(2000);
//		String text=button.getAttribute("type");
//		System.out.println(text);
//		String tagname=button.getTagName();
//		System.out.println(tagname);
//		button.click();
//		driver.close();
		driver.quit();
	}

}
