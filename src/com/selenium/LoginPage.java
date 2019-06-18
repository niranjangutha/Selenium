package com.selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "h:\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		FileReader file=new FileReader("‪H:\\text.txt");
		
		BufferedReader br=new BufferedReader(file);
		
		int count=0;
		int iterator=0;
		String line;
		
		while((line=br.readLine())==null)
		{
		count=count+1;
		System.out.println(line);
		if(count>1)
		{
		iterator=iterator+1;
		String inputdata[]=line.split(",", 2);

		
		driver.get("file:///H:/login.html");
		Thread.sleep(3000);
		driver.findElement(By.name("userid")).sendKeys(inputdata[0]);
		driver.findElement(By.name("pswrd")).sendKeys(inputdata[1]);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(3000);
		Alert  alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		if(alerttext.contains("login successful"))
		{
			alert.accept();
			Thread.sleep(3000);
			System.out.println("user successfully login --- passed");
			
			
			
		}
		else {
		alert.accept();
		System.out.println("user unsuccessfully login --- failed");
		}
		driver.close();
		}
		}
	br.close();
	file.close();
	
	
	
	
	}
	}
