package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		absolutepath();
		//relativexpathusingtagname();
		relativexpathusingtagnamewithIndex();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///C:/Users/Tabasu/Downloads/xpath_xpathaxes_samplehtmlfiles/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void absolutepath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativexpathusingtagname()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input")).sendKeys("demoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativexpathusingtagnamewithIndex()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("demoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
