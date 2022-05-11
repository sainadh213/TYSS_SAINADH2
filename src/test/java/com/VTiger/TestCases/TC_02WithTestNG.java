package com.VTiger.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.VTiger.ObjectREpo.CreateNewOrgPage;
import com.VTiger.ObjectREpo.HomePage;
import com.VTiger.ObjectREpo.OrgInfoPage;
import com.VTiger.generic.BaseClass;
import com.VTiger.generic.JavaUtil;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class TC_02WithTestNG extends BaseClass{
	
	@Test//(invocationCount =2)
	public void createorg_dd () throws Throwable {
		HomePage homePage= new HomePage(driver);
		homePage.getOrglink().click();

		OrgInfoPage orgInfoPage = new OrgInfoPage(driver);
		orgInfoPage.getCreateorgbtn().click();

		TestData testData= new TestData();
		JavaUtil javaUtil = new JavaUtil();
		String orgname=testData.getOrganizationName()+javaUtil.createRandomnumber();
		CreateNewOrgPage createNewOrgPage= new CreateNewOrgPage(driver);

		createNewOrgPage.getOrgname().sendKeys(orgname);
		WebDriverUtil webDriverUtil= new WebDriverUtil(driver);

		webDriverUtil.selectValuefromdd("Active", createNewOrgPage.getRating());

		webDriverUtil.selectValuefromdd(createNewOrgPage.getIndustry(), "Education");

		webDriverUtil.selectValuefromdd(createNewOrgPage.getType(), 3);

		createNewOrgPage.getSaveorgbtn().click();

		Thread.sleep(4000);
		driver.navigate().refresh();

		homePage.getOrglink().click();

		orgInfoPage.searchforOrg(orgname, "accountname");

		Thread.sleep(3000);

		String actualorgname=orgInfoPage.getfirstOrg().getText();

		/*if (orgname.equals(actualorgname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}*/
		Assert.assertFalse(true);
		Assert.assertEquals(orgname, actualorgname);
	}
}
