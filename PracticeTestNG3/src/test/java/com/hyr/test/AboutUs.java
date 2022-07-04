package com.hyr.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AboutUs {

	@Test(priority=8)
	public void aboutUs() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\aboutus.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Back to Home")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=7)
	public void cart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("C:\\Users\\itctesting22\\Desktop\\web site\\cart2.html");
		d.findElement(By.name("Item")).sendKeys("computer books");
		d.findElement(By.name("Quantity")).sendKeys("3");
		d.findElement(By.id("save")).click();
		Thread.sleep(1000);
		Alert sa=d.switchTo().alert();
		sa.accept();
		d.findElement(By.id("clear")).click();
		Thread.sleep(1000);
		Alert ca=d.switchTo().alert();
		ca.accept();
		d.close();
	}
	
	
	@Test(priority=6)
	public void books() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\book.html");
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		driver.close();
	}
		@Test(priority=1)
		public void Home() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/itctesting22/Desktop/web%20site/index.html");
			Thread.sleep(2000);
	//		driver.findElement(By.linkText("Login Page")).click();
	//		driver.findElement(By.partialLinkText("About")).click();
	//		driver.findElement(By.tagName("a")).click();
	//		driver.findElement(By.linkText("Cart")).click();
	//		driver.findElement(By.linkText("Books")).click();
			driver.close();
		}
	@Test(priority=2)
	public void AdminLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\admin1.html");
		driver.findElement(By.id("username")).sendKeys("Formget");
		driver.findElement(By.id("password")).sendKeys("Formget@123");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.close();
	}
	@Test(priority=3)
	public void adminBook() throws Exception {
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
	@Test(priority=5)
	public void StudentLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/itctesting22/Desktop/web%20site/student.html");
		driver.findElement(By.className("loginbtn")).click();
		driver.findElement(By.className("login-page"));
		driver.findElement(By.className("toggle-btn1"));
		driver.findElement(By.id("e-mail")).sendKeys("aisha23@gmail.com");
		driver.findElement(By.id("pass-id")).sendKeys("Aishakhan23");
		driver.findElement(By.className("check-box")).isSelected();
		Thread.sleep(2000);
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
		driver.close();

	}
	@Test(priority=4)
	public void StudentRegistration() throws InterruptedException {
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

