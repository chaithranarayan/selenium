package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("toggle-btn2")).click();
		driver.findElement(By.id("fname")).sendKeys("chaithra");
		driver.findElement(By.id("laname")).sendKeys("narayanappa");
		
	}

}
