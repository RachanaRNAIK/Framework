package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign {
	public CreateCampaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement Createcmp;
	@FindBy(name="campaignname")
	private WebElement cmpName;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	public WebElement getCreatecmp() {
		return Createcmp;
	}
	public WebElement getCmpName() {
		return cmpName;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void ClickCreateCamp()
	{
		Createcmp.click();
	}
	public void ClickSave()
	{
		saveBtn.click();
	}
	public void CreateNewCampaign(String campaignName)
	{
		cmpName.sendKeys(campaignName);
	}
}
