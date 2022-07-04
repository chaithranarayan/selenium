package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.Alert;
public class Resgi {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/itctesting22/Desktop/web%20site/student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("toggle-btn2")).click();
		driver.findElement(By.id("fname")).sendKeys("chaithra");
		Thread.sleep(2000);
		driver.findElement(By.id("laname")).sendKeys("narayanappamn");
		driver.findElement(By.id("email")).sendKeys("chai@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Narayanappa1");
		driver.findElement(By.id("con")).sendKeys("Narayanappa1");
		driver.findElement(By.id("gender2")).click();
		driver.findElement(By.id("check")).click();
		WebElement selected= driver.findElement(By.id("check"));
		boolean a= selected.isSelected();
//		System.out.println(a);
		
//		if(isSelected ==false) {
//			System.out.println("yes your check box is selected");
//		}
	driver.findElement(By.id("res")).click();	
	}
}

