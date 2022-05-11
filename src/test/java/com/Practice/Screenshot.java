package com.Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
@Test
public void screenshot() throws Throwable
{
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://localhost:8888");
WebElement untb = driver.findElement(By.name("user_name"));
untb.sendKeys("admin");
WebElement pwtb = driver.findElement(By.name("user_password"));
pwtb.sendKeys("admin");
TakesScreenshot ts=(TakesScreenshot)driver;
File src= ts.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\Selenium\\TYSS_SAINADH2\\Screenshots\\VTiher.png");
Files.copy(src, dest);
Thread.sleep(2000);
driver.close();
	}
}
