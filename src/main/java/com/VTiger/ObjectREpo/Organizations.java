package com.VTiger.ObjectREpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.generic.WebDriverUtil;

public class Organizations {
	WebDriver driver;
	public Organizations(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Organizations']")
	  private WebElement orglink;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement orgimage;
	
 @FindBy(name="search_text")
   private WebElement searchbox;
 
 @FindBy(name="search_field")
 private WebElement orgdd;
 
 @FindBy(name="submit")
 private WebElement searchbtn;
 
 @FindBy(name="accountname")
 private WebElement orgnametb;
 
 @FindBy(xpath="//input[@title='Save [Alt+S]']")
 private WebElement savebtn;
 

public WebElement getOrglink() {
	return orglink;
}
public WebElement getOrgimage() {
	return orgimage;
}
public WebElement getSearchbox() {
	return searchbox;
}
public WebElement getOrgdd() {
	return orgdd;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public WebElement getOrgnametb() {
	return orgnametb;
}
public WebElement getSavebtn() {
	return savebtn;
}
WebDriverUtil wdu=new WebDriverUtil(driver);
 public void searchOrg(String orgname) throws Throwable
 {
	 orglink.click();
	 searchbox.sendKeys(orgname);
	// wdu.selectValuefromdd(orgdd,value);
	 wdu.selectValuefromdd(orgdd, 1);
	 searchbtn.click();
	  
 }
 public void createOrg(String orgname)
 {
	 orglink.click();
	 orgimage.click();
	 orgnametb.sendKeys(orgname);
	 savebtn.click();
	 
	 
	 
 }
}
