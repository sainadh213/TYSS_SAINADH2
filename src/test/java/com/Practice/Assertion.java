package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	@Test
	public void sample()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		WebElement untb = driver.findElement(By.name("user_name"));
		boolean un = untb.isDisplayed();
		Assert.assertEquals(un,true);
		untb.sendKeys("admin");
		WebElement pwtb = driver.findElement(By.name("user_password"));
		boolean pw = pwtb.isDisplayed();
		Assert.assertEquals(pw,true);
		pwtb.sendKeys("admin");
		WebElement subbtn = driver.findElement(By.id("submitButton"));
		boolean sbtn = subbtn.isDisplayed();
		Assert.assertEquals(sbtn,true);
		subbtn.click();
		

	}

}

