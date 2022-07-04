package com;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
public class Sel1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\itctesting22\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.findElement(By.id("username")).sendKeys("chaithramn");
//driver.findElements(By.id("password")).sendKeys("123456789");
driver.findElement(By.id("password")).sendKeys("123456789");
Thread.sleep(2000);
driver.findElement(By.id("login")).click();
//driver.findElement(By.id("location"))
Select dropDown=new Select(driver.findElement(By.id("location")));
dropDown.selectByIndex(3);

//driver.close();
}
}
