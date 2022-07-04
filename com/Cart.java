package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("C:\\Users\\itctesting22\\Desktop\\web site\\cart2.html");
		d.findElement(By.name("Item")).sendKeys("computer books");
		  d.findElement(By.name("Quantity")).sendKeys("3");
		  d.findElement(By.id("save")).click();
		  Thread.sleep(1000);
		  Alert sa=d.switchTo().alert();
		  sa.accept();
//		   Thread.sleep(2000);
		  d.findElement(By.id("clear")).click();
		  Thread.sleep(1000);
		  Alert ca=d.switchTo().alert();
		  ca.accept();
		  d.close();
	}

} 

