package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupIndex {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("file:///H:/login.html");
		String text=driver.findElement(By.xpath("//div[3]/input")).getAttribute("value");
		
		System.out.println(text);
		
		driver.close();

		
	}

}
