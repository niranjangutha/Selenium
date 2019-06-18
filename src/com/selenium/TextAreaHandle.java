package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement edit=driver.findElement(By.id("email"));
		boolean disp=edit.isDisplayed();
		System.out.println(disp);
		boolean enable=edit.isEnabled();
		System.out.println(enable);
		String value=edit.getAttribute("value");// when ever V is capiital letters it will showing a null as output
		System.out.println(value);
		Thread.sleep(3000);
		String s1="niranjan";
		edit.sendKeys(s1);
		Thread.sleep(3000);
		String value2=edit.getAttribute("value");
		System.out.println(value2);
		Thread.sleep(3000);
		String data=driver.findElement(By.className("_58mu")).getText();
		System.out.println(data);
		edit.clear();
		driver.close();
		

	}

}
