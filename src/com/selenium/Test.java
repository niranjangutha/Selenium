package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		Thread.sleep(3000);
//		driver.get("file:///H:/login.html");
//		driver.findElement(By.id("userid")).sendKeys("");
//		driver.findElement(By.id("pswrd")).sendKeys("");
//		driver.findElement(By.id("/html/body/form/input[3]")).submit();
//		String Url=driver.getCurrentUrl();
//		System.out.println("url");
//		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("niranjan");
		driver.findElement(By.id("pass")).sendKeys("niranjan");
		driver.findElement(By.id("loginbutton")).click();
	
		
		
		driver.close();
		}
}
// check with browser compitability

//driver.get("https://www.google.com/");
//driver.manage().window().fullscreen();
//Thread.sleep(3000);
//driver.manage().window().maximize();
//Thread.sleep(3000);
//driver.navigate().to("http://facebook.com");
//Thread.sleep(3000);
//driver.navigate().back();
//Thread.sleep(3000);
//driver.navigate().forward();
//Thread.sleep(3000);
//driver.navigate().refresh();
//Thread.sleep(3000);





// Enter the text fields by letters not words in ie 64 

//driver.get("https://www.facebook.com/");
//driver.findElement(By.id("email")).sendKeys("niranjan");
//driver.findElement(By.id("pass")).sendKeys("niranjan");
//driver.findElement(By.id("loginbutton")).click();

// how to geturl from current browser window will be close


