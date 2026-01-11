package org.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("testleaf.2023@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321 ");
	driver.findElement(By.name("login")).click();
	
	
}
}
