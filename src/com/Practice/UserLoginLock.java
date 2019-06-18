package com.Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginLock {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("webdriver.ie.driver", "H:\\IEbrowser32\\IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
//		System.setProperty("webdriver.gecko.driver", "H:\\firefoxdriver\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		
		FileReader file=new FileReader("H:\\text.txt");
		BufferedReader br =new BufferedReader(file);
		int count=0;
		int iteration=0;
		String line;
		while((line=br.readLine())!=null)
		{
			count=count+1;
			if(count>1)
			{
				iteration=iteration+1;
				String inputdata[]=line.split(",",2);
				driver=new ChromeDriver();
				driver.get("file:///H:/login.html");
				WebElement name=driver.findElement(By.name("userid"));
				WebElement pass=driver.findElement(By.name("pswrd"));
				name.sendKeys(inputdata[0]);
				Thread.sleep(3000);
				pass.sendKeys(inputdata[1]);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='button']")).click();
				Thread.sleep(3000);
				Alert Popup=driver.switchTo().alert();
				Thread.sleep(3000);
				String poptext=Popup.getText();
				System.out.println(poptext);
				
						
				//String Url=driver.getCurrentUrl();
				if(poptext.contains("login successful"))
				{
					Popup.accept();
					System.out.println(iteration+"Admmin login is sucessfull-passed");
					System.out.println("current url:"+driver.getCurrentUrl());
					
				}
				else
				{
					Popup.accept();
					System.out.println(iteration+"Admmin login is unsucessfull-failed");
				}
				driver.quit();
			}
			
		}
		br.close();
		file.close();
		}
}
