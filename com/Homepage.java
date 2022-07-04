package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting22/Desktop/web%20site/index.html");
		Thread.sleep(2000);
		driver.close();
//		driver.findElement(By.tagName("a")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("Cart")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Books")).click();



			
	}

}
