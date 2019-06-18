package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(3000);
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		WebElement radio=driver.findElement(By.id("u_0_9"));
//		boolean disp=radio.isDisplayed();
//		System.out.println(disp);//true
//		boolean enable=radio.isEnabled();
//		System.out.println(enable);//true
//		Thread.sleep(3000);
//		boolean select=radio.isSelected();
//		System.out.println(select);//flase
//		radio.click();
//		boolean select1=radio.isSelected();
//		System.out.println(select1);// true
//		
		WebElement radio1=driver.findElement(By.id("u_0_a"));
		boolean disp1=radio1.isDisplayed();
		System.out.println(disp1);//true
		boolean enable1=radio1.isEnabled();
		System.out.println(enable1);//true
		Thread.sleep(3000);
		boolean select2=radio1.isSelected();
		System.out.println(select2);//flase
		radio1.click();
		boolean select3=radio1.isSelected();
		System.out.println(select3);//true
		//System.out.println("femaale:"+select1);//flase
		
		driver.close();	
	}

}
