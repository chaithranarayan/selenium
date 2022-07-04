package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicttime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\admin1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		

	}

}
