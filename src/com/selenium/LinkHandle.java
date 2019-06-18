package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/"); 
		WebElement link=driver.findElement(By.linkText("Gmail"));
		String text=link.getText();
		System.out.println(text);//Gmail
		boolean b1=link.isDisplayed();
		System.out.println(b1);//true
		boolean b2=link.isEnabled();
		System.out.println(b2);//true
		String value=link.getAttribute("href");
		System.out.println(value);//link value
		String tagname=link.getTagName();
		System.out.println(tagname);//a
		link.click();
		driver.close();

	}

}
