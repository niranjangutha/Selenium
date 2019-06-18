package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSpace {
/*
 * Handle Non breakable space or normal spaces are handle  to use 
 * Xpath[contains(text(),"textvalue")]
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///H:/login.html");
		driver.findElement(By.xpath("//input[@name='userid']")).clear();
		Thread.sleep(3000);
		String va=driver.findElement(By.xpath("//div[contains(text(),'selenium')]")).getText();
	
		System.out.println(va);
		
		String v1=driver.findElement(By.xpath("//td[.='selenium']/../td[2]")).getText();
		System.out.println(v1);
		
		driver.close();
		
	

	}

}
