package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///H:/first.html");
		WebElement table=driver.findElement(By.id("vegitable"));
		List <WebElement> cells	=table.findElements(By.tagName("td"));
		System.out.println(cells.size());
		
		String val=driver.findElement(By.xpath("//*[@id=\'vegitable\']/tbody/tr[2]/td[1]")).getText();
		System.out.println(val);
		List <WebElement> rows	=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		System.out.println("columns size:"+(cells.size()/rows.size()));
		driver.close();
	}

}
