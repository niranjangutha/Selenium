package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AbstractAnnotations")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
