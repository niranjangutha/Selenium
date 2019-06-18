package com.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///H:/login.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement name=driver.findElement(By.name("userid"));
		WebElement pass=driver.findElement(By.name("pswrd"));
		name.sendKeys("niranjan");
		Thread.sleep(3000);
		pass.sendKeys("niranjan123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		//Thread.sleep(3000);
		Alert Popup=driver.switchTo().alert();
		//Thread.sleep(3000);
		String poptext=Popup.getText();
		System.out.println(poptext);
		Popup.accept();
		//String windowHandle = driver.getWindowHandle();
		String Title=driver.getTitle();
		driver.close();
	}

}
