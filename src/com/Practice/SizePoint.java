package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizePoint {

	public static void main(String[] args) {
//		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		// width and height for the email textbox
		Dimension widthheight=driver.findElement(By.id("email")).getSize();
		System.out.println("width and height :"+widthheight);
		// postion(x,y) of the textbox
		Point point=driver.findElement(By.id("email")).getLocation();
		System.out.println("postion of the email textbox:"+point);
		// font size in textbox
		String font=driver.findElement(By.id("email")).getCssValue("font-size");
		System.out.println("font size for eamil textbox:"+font);
		// font family in textbox
				String fontfamily=driver.findElement(By.id("email")).getCssValue("font-family");
				System.out.println("font-family for email textbox:"+fontfamily);
		driver.close();

	}

}
