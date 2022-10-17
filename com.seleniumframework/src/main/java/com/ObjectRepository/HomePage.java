package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic_Utilities.WebDriver_Utility;

public class HomePage {

	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(linkText="Organizations")
	private WebElement organizationLinkText;
	@FindBy(linkText="Products")
	private WebElement productLinkText;
	@FindBy(linkText="More")
	private WebElement moreLinkText;
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement CampaignLinkText;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminButton;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutbtn;
	
	//getter methods
	public WebElement getOrganizationLinkText() {
		return organizationLinkText;
	}
	public WebElement getProductLinkText() {
		return productLinkText;
	}
	public WebElement getMoreLinkText() {
		return moreLinkText;
	}
	public WebElement getCampaignLinkText() {
		return CampaignLinkText;
	}
	public WebElement getAdminButton() {
		return adminButton;
	}
	public WebElement getSignOutbtn() {
		return signOutbtn;
	}


//logic for organization
public void ClickOrganizationLink()
{
	organizationLinkText.click();	
}
public void ClickProductLink()
{
	productLinkText.click();	
}
public void moveToMoreLinkText(WebDriver driver)	
{
	WebDriver_Utility wb=new WebDriver_Utility();
	wb.mouseOverOnElement(driver,moreLinkText);
}
public void ClickCampaignLink()
{
	CampaignLinkText.click();
}
public void ClickAdminLink()
{
	adminButton.click();
}
public void moveToSignOutBtn(WebDriver driver)
{
	WebDriver_Utility wb=new WebDriver_Utility();
	wb.mouseOverOnElement(driver,signOutbtn);
	signOutbtn.click();
}
}