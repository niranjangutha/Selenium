package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CheckboxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///H:/first.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@name='telugu']"));
		boolean display=checkbox.isDisplayed();
		System.out.println(display);
		boolean enable=checkbox.isEnabled();
		System.out.println(enable);
		boolean select=checkbox.isSelected();
		System.out.println(select);
		checkbox.click();
		Thread.sleep(2000);
		boolean select1=checkbox.isSelected();
		System.out.println(select1);
		Thread.sleep(2000);

		checkbox.click();
		boolean select3=checkbox.isSelected();
		System.out.println(select3);		driver.close();
	}

}
