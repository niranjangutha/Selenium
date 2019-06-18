package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingKeys {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///H:/login.html");
		WebElement username=driver.findElement(By.name("userid"));
		WebElement password=driver.findElement(By.name("pswrd"));
		boolean b1=username.isEnabled();
		
		if(b1==true)
		{
			System.out.println("username element is enabled");
			System.out.println("keys method is when element is enabled ");
			username.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
			username.sendKeys("naidu");
			Thread.sleep(3000);
			
		}
		else 
		{
			System.out.println("username is disabled");
			System.out.println("here we cont edit the username textbox because element is diables ");
			System.out.println("element is disables we perform only copy the element using getAttribute()");
			//username.sendKeys(Keys.CONTROL+"ac");
			//password.sendKeys(Keys.CONTROL+"v");
			String uname=username.getAttribute("value");
			password.sendKeys(uname);
			Thread.sleep(3000);
			
		}
		driver.navigate().to("file:///H:/first.html");
		WebElement fname=driver.findElement(By.id("firstname"));
		fname.sendKeys("shdfjhsfzjg");
		Thread.sleep(3000);
		
		fname.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("pwd"));
		pass.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		fname.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(3000);
		pass.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(3000);
		
		
		
	
		driver.close();
	
	}

}
