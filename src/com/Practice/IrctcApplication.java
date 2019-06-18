package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@class='ng-tns-c14-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(3000);
		Actions action=(Actions)driver;
		WebElement elemwnt=driver.findElement(By.xpath("//a[contains(text(),'TRAINS')]"));
		action.moveToElement(elemwnt).perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c14-6 ng-star-inserted']")).sendKeys("2011");
		//driver.findElement(By.xpath("//tbody[contains(text(),'1')]")).click();
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		//boolean b1=driver.findElement(By.xpath("//tbody[contains(text(),'1')]")).isSelected();
		//System.out.println(b1);
		Thread.sleep(3000);

	}

}
