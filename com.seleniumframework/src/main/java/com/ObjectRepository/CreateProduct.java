package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct {
 
	public CreateProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createProductImg;
	@FindBy(name="productname")
	private WebElement productNameEdt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public WebElement getCreateProductImg() {
		return createProductImg;
	}
	public WebElement getProductNameEdt() {
		return productNameEdt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
    public void createProduct()
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
}
