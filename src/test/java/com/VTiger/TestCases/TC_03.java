package com.VTiger.TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.VTiger.generic.BaseTest;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class TC_03 extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest b=new BaseTest();
		b.openBrowser();
		WebDriverUtil wdu=new WebDriverUtil(driver);
		wdu.maxwindow();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		wdu.pageloadtimeout();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		 TestData td=new TestData();
		 String lastname = td.getlastName();
		 driver.findElement(By.name("lastname")).sendKeys(lastname);
		 String createcontactpagetitle=driver.getTitle();

			System.out.println("Parent title="+createcontactpagetitle);
			driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();

			Thread.sleep(2000);
			wdu.switchWindow("Accounts");
			
			Thread.sleep(4000);

			//driver.findElement(By.id("search_txt")).sendKeys("Mango");

			//driver.findElement(By.name("search")).click();

			driver.findElement(By.id("1")).click();

			Thread.sleep(2000);
			wdu.switchWindow("Contacts");

			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(6000);

			String contactid=driver.findElement(By.xpath("//td[@id='mouseArea_First Name']/../td[4]")).getText();
			driver.findElement(By.xpath("//a[.='Contacts']")).click();

			driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(contactid);

			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(2000);
			
			String actualcontactlastname=driver.findElement(By.xpath("(//a[@title='Contacts'])[2]")).getText();

			if (actualcontactlastname.equals(lastname)) 
			{
				System.out.println("Tc Passes");
			}
			else {
				System.out.println("TC Fail");
			}

			 WebElement signoutimg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

			wdu.moveToelement(signoutimg);

			driver.findElement(By.xpath("//a[.='Sign Out']")).click();

			Thread.sleep(10000);

			driver.close();
			
			

		 
	}

}
