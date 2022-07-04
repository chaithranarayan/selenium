package com;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting22/Desktop/web%20site/index.html");
driver.findElement(By.linkText("Books")).click();
Thread.sleep(2000);
driver.findElement(By.id("button")).click();
                  Thread.sleep(3000);
driver.findElement(By.className("btn")).click();





//		driver.findElement(By.linkText("Login Page")).click();
//		driver.findElement(By.linkText("LOGIN")).click();
////		driver.findElement(By.linkText("Home")).click();
//		driver.findElement(By.linkText("Admin")).click();
//		driver.findElement(By.linkText("StudentLogin")).click();
//		driver.findElement(By.linkText("Books")).click();
//		driver.findElement(By.className("lib"));
//		driver.findElement(By.linkText("Login Page")).click();
//		thread.sleep(2000);
//		driver.close();
	}

}
