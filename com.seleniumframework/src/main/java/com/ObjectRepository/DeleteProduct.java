package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic_Utilities.WebDriver_Utility;

public class DeleteProduct {

	public DeleteProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductImg;
	@FindBy(name="productname")
	private WebElement productNameEdt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	@FindBy(name="Delete")
	private WebElement dlt;
	
	public WebElement getCreateProductImg() {
		return createProductImg;
	}
	public WebElement getProductNameEdt() {
		return productNameEdt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getDlt() {
		return dlt;
	}
	//logic
	public void ClickCreateProduct()
	{
		createProductImg.click();
	}
	public void createNewProduct(String productName)
	{
		productNameEdt.sendKeys(productName);
	}
	public void ClickSave()
	{
		saveBtn.click();
	}
	public void ClickDelete()
	{
		dlt.click();
	}
	public void switchToAlertAndAccept(WebDriver driver)
	{
		WebDriver_Utility wb=new WebDriver_Utility();
		wb.switchToAlertAndAccept(driver);
	}
}
