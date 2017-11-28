package com.selenium.SeleniumDemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test1 {

	//Shree Krishna Sharanama Mamah
	
	
		@Test
		public void testSelenium() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","/Users/pgandhi/Documents/Rename/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shutterfly.com");
			System.out.println("print title:-"+driver.getCurrentUrl());
			Thread.sleep(10000);
			WebElement getLink = driver.findElement(By.xpath("//*[@class='column1']"));
			List<WebElement> allLinks = getLink.findElements(By.tagName("a"));
			for(int i=0;i<allLinks.size();i++)
			{
				System.out.println(allLinks.get(i).getText());
				
			}
			
			driver.quit();
		}
		
		
		

	
	
}
