package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminBook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("C:\\Users\\itctesting22\\Desktop\\web site\\adminbook.html");
		d.findElement(By.id("bookname")).sendKeys("computer book");
		  d.findElement(By.id("price")).sendKeys("300");
		  d.findElement(By.id("img")).sendKeys("C:\\Users\\itctesting22\\Desktop\\web site");
		  Thread.sleep(1000);
		  d.findElement(By.id("add-btn")).click();
		  d.close();

	}

}
