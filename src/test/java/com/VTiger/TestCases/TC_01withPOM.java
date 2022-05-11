package com.VTiger.TestCases;

import org.openqa.selenium.By;

import com.VTiger.ObjectREpo.HomePage;
import com.VTiger.ObjectREpo.LoginPage;
import com.VTiger.ObjectREpo.Organizations;
import com.VTiger.generic.BaseTest;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class TC_01withPOM extends BaseTest {
	
		public static void main(String[] args) throws Throwable {
			BaseTest b=new BaseTest();
			b.openBrowser();
			WebDriverUtil wdu=new WebDriverUtil(driver);
			wdu.maxwindow();
			LoginPage lp=new LoginPage(driver);
			lp.logintoApp();
			 TestData td=new TestData();
			String orgname = td.getOrganizationName();
			
			Organizations or=new Organizations(driver);
			or.createOrg(orgname);
			Thread.sleep(4000);
			
			or.searchOrg(orgname);

		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		System.out.println(name);
		
		if(name.equals(orgname))
		{
			System.out.println("Organization is Successfully Created-Verified-Pass");
		}
		else
		{
			System.out.println("Organization is not Created");
		}
		
		HomePage hp=new HomePage(driver);
		hp.logoutfromApp();
		Thread.sleep(4000);
		driver.close();
		}

	}



