package com.VTiger.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
public void openBrowser() throws IOException
{
	
	ProppertyFiles pf=new ProppertyFiles();
		String BROWSER=	pf.readDatafrompropertyfile("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("No Browser Provided Launching Default browser");
			driver= new ChromeDriver();
		}

		driver.get(pf.readDatafrompropertyfile("url"));
		//driver.manage().window().minimize();

		/*driver.findElement(By.name("user_name")).sendKeys(pf.readDatafrompropertyfile("username"));
		driver.findElement(By.name("user_password")).sendKeys(pf.readDatafrompropertyfile("password"));
        driver.findElement(By.id("submitButton")).click();*/

	}}

