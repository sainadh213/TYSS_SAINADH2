package com.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.VTiger.ObjectREpo.LoginPage;
import com.VTiger.ObjectREpo.Organizations;
import com.VTiger.generic.BaseTest;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class Tc_02withPOM extends BaseTest{
	public static void main(String[] args) throws Throwable  {
		BaseTest b=new BaseTest();
		b.openBrowser();
		WebDriverUtil wdu=new WebDriverUtil(driver);
		wdu.maxwindow();
		LoginPage lp=new LoginPage(driver);
		lp.logintoApp();
		Organizations or=new Organizations(driver);
		or.getOrglink().click();
		or.getOrgimage().click();
		 TestData td=new TestData();
		String orgname = td.getOrganizationName();
		
	or.getOrgnametb().sendKeys(orgname);
		WebElement dd1 = driver.findElement(By.name("industry"));
		wdu.selectValuefromdd(dd1,"Education");
		WebElement dd2 = driver.findElement(By.name("accounttype"));
		wdu.selectValuefromdd(dd2,"Customer");
		WebElement dd3 = driver.findElement(By.name("rating"));
		wdu.selectValuefromdd(dd3,"Active");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(4000);
		//wdu.maxwindow();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Organizations'])[1]")));
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(orgname);
				WebElement ddadd = driver.findElement(By.xpath("//select[@class='txtBox']"));
				
	wdu.selectValuefromdd(ddadd,"accountname");
	driver.findElement(By.name("submit")).click();

	Thread.sleep(2000);
//String name = driver.findElement(By.xpath("//a[text()='"+orgname+"']")).getText();
	//String name = driver.findElement(By.xpath("//a[text()='" + orgname + "']")).getText();
	String name = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
	System.out.println(name);
	
	if(name.equals(orgname))
	{
		System.out.println("Organization is Successfully Created");
	}
	else
	{
		System.out.println("Organization is not Created");
	}
	WebElement addr=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	  wdu.moveToelement(addr);
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	  Thread.sleep(4000);
	driver.close();

	}

}
