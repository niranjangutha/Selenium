package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PopUpHandle {

	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("niranjan gutha");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("19032014");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		Alert popUp=driver.switchTo().alert();
		Thread.sleep(2000);
		popUp.dismiss();
		Thread.sleep(2000);
		driver.close();
	}

}
//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//driver.findElement(By.name("proceed")).click();
//Thread.sleep(2000);
//Alert window= driver.switchTo().alert();
//Thread.sleep(2000);
//String text=window.getText();
//System.out.println(text);
//Thread.sleep(2000);
//window.dismiss();
////window.accept();
//Thread.sleep(2000);
//driver.close();
