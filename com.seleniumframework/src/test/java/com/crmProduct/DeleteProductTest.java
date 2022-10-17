package com.crmProduct;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Generic_Utilities.BaseClass;
import com.Generic_Utilities.Excel_Utility;
import com.Generic_Utilities.File_Utility;
import com.Generic_Utilities.Java_Utility;
import com.ObjectRepository.CreateProduct;
import com.ObjectRepository.DeleteProduct;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.ValidationAndVerificationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteProductTest extends BaseClass {
	public void DeleteProductTest() throws Throwable {
		
		
		/*String key="webdriver.chrome.driver";
		String value="C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);*/
		
		/*File_Utility flib=new File_Utility();
		   
		String URL=flib.getPropertyKeyValue1("url");
		String UserName=flib.getPropertyKeyValue1("un");
		String Password=flib.getPropertyKeyValue1("pw");
		driver.get(URL);
		
		//login
		LoginPage login=new LoginPage(driver);
	    login.login(UserName, Password);*/
	    
		/*driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(Password);
		driver.findElement(By.id("submitButton")).click();*/
		
	    HomePage home=new HomePage(driver);
		home.ClickProductLink();
		 DeleteProduct pro=new DeleteProduct(driver);
		 pro.ClickCreateProduct();
		
		/*driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();*/
		
		Java_Utility jlib=new Java_Utility();
		int ranNum=jlib.getRanDomNum();
		
		Excel_Utility elib=new Excel_Utility();
		String data=elib.getDataFromExcel("Sheet1",0,0)+ranNum;
		
		pro.createNewProduct(data);
		pro.ClickSave();
		
		/*driver.findElement(By.name("productname")).sendKeys(data);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();*/
		
		ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
		validate.deleteProductValidation(driver, data);
		
		/*String actData=driver.findElement(By.cssSelector("span.lvtHeaderText")).getText();
		if(actData.contains(data))
		{
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
		pro.ClickDelete();
		pro.switchToAlertAndAccept(driver);
		/*driver.findElement(By.name("Delete")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();*/
		home.ClickAdminLink();
		home.getSignOutbtn().click();
		/*driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
	}

}


