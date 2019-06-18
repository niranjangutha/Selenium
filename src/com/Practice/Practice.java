package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///H:/login.html");
		WebElement username=driver.findElement(By.name("userid"));
		boolean disp=username.isEnabled();
		System.out.println(disp);
		if(disp==true)
		{
		username.clear();
		username.sendKeys("naidu");
		}
		else
		{
			System.out.println("Element is disabled");
			
		}
		//String value=username.getAttribute("value");// using getAtribute method
		username.sendKeys(Keys.CONTROL+"ac");// using keys to select and copy
		Thread.sleep(3000);
		driver.findElement(By.name("pswrd")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		username.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
