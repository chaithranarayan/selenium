package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\admin1.html");
		driver.findElement(By.id("username")).sendKeys("Formget");
		driver.findElement(By.id("password")).sendKeys("Formget@123");
		  driver.findElement(By.id("submit")).click();
		  driver.switchTo().alert().accept();
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept();
		  driver.close();
	}

}
