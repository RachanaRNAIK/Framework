package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignWithProduct {

	public CampaignWithProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement CreateProductbtn;
	
	@FindBy(name="productname")
	private WebElement productNameTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement select;
	
	@FindBy(id="search_txt")
	private WebElement searchProduct;
	
	@FindBy(name="search")
	private WebElement searchbtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement prodSaveBtn;

	public WebElement getCreateProductbtn() {
		return CreateProductbtn;
	}

	public WebElement getProductNameTextField() {
		return productNameTextField;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getSearchProduct() {
		return searchProduct;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getProdSaveBtn() {
		return prodSaveBtn;
	}
	
	public void ClickCreateProduct()
	{
		CreateProductbtn.click();
	}
	
	 public void createNewProduct(String productName)
	    {
		 productNameTextField.sendKeys(productName);
	    }
	 public void ClickSaveButton()
	 {
		 savebtn.click();
	 }
	 public void select()
	 {
		 select.click(); 
	 }
	 public void SearchProduct(String productName)
	 {
		 searchProduct.sendKeys(productName);
	 }
	 public void searchbtn()
	 {
		 searchbtn.click();
	 }
	 public void productSave()
	 {
		 prodSaveBtn.click();
	 }
}
