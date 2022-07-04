package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("login-page"));
		driver.findElement(By.className("toggle-btn1"));
        driver.findElement(By.id("e-mail")).sendKeys("aisha23@gmail.com");
		driver.findElement(By.id("pass-id")).sendKeys("Aishakhan23");
		driver.findElement(By.className("check-box")).isSelected();
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
	}

}
