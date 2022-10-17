package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndVerificationPage {
	
	public ValidationAndVerificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="span.dvHeaderText")
	private WebElement actualOranizationData;
	
	public WebElement getActualOranizationData() {
		return actualOranizationData;
	}
	
	//business logic for org
	public void organizationValidation(WebDriver driver,String data)
	{
		String actData=actualOranizationData.getText();
	
	if(actData.contains(data))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement actualProductData;

	public WebElement getActualProductData() {
		return actualProductData;
	}
	
	//business logic for createProduct
	public void createProductValidation(WebDriver driver,String data)
	{
		String actData=actualProductData.getText();
		if(actData.contains(data))
		{
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement actualDeleteProductData;

	public WebElement getActualDeleteProductData() {
		return actualDeleteProductData;
	}
	
	//business logic for deleteProductData
	public void deleteProductValidation(WebDriver driver,String data)
	{
		String actData=actualDeleteProductData.getText();
		if(actData.contains(data))
		{
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@FindBy(css="span.dvHeaderText")
	private WebElement actualCampaignData;

	public WebElement getActualCampaignData() {
		return actualCampaignData;
	}
	//business logic for campaign
	public void campaignValidation(WebDriver driver,String data)
	{
		String actData=actualCampaignData.getText();
		if(actData.contains(data))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
