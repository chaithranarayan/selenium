package com.hyr.test;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
@Test
	public void chrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("nature",Keys.ENTER);
		String expectedTitle="nature - Google Search";
		String actualTitle=driver.getTitle();
	assertEquals(actualTitle, expectedTitle,"title is mismatchd");
	assertTrue(false);
driver.close();
}

@Test
public void FaceBook() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("9798960502",Keys.ENTER);
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.close();
}
@Test
public void aboutus() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\itctesting22\\Desktop\\web site\\aboutus.html");
driver.findElement(By.tagName("a")).click();
}
}
