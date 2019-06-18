package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinkHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement image=driver.findElement(By.id("hplogo"));
		String text=image.getAttribute("style");
		System.out.println(text);	
		image.click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
