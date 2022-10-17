package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {

	public CreateOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrgImg;
	@FindBy(name="accountname")
	private WebElement orgNameEdt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//getter
	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}
	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//logic
	public void ClickCreateOrganization()
	{
		createOrgImg.click();
	}
	
	public void organization(String orgName)
	{
		orgNameEdt.sendKeys(orgName);
	}
	public void ClickSaveButton()
	{
		saveBtn.click();
}
}
