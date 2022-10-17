package com.crmOrganization;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Generic_Utilities.BaseClass;
import com.Generic_Utilities.Excel_Utility;
import com.Generic_Utilities.File_Utility;
import com.Generic_Utilities.Java_Utility;
import com.Generic_Utilities.WebDriver_Utility;
import com.ObjectRepository.CreateOrganization;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.ValidationAndVerificationPage;
import com.ObjectRepository.CreateOrganization;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOranizationTest extends BaseClass{

	
   // @Test(retryAnalyzer=com.Generic_Utilities.RetryAnalyser.class)
	@Test
	public void createOranizationTest() throws Throwable
	{
		
			
			/*String key="webdriver.chrome.driver";
			String value="C:\\Ustg ers\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();*/
			
		    WebDriver_Utility wlib=new WebDriver_Utility();
			wlib.waitForPageLoad(driver);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			/*File_Utility flib=new File_Utility();
			
			String URL=flib.getPropertyKeyValue1("url");
			String UserName=flib.getPropertyKeyValue1("un");
			String Password=flib.getPropertyKeyValue1("pw");
		    driver.get(URL);
		    
		    LoginPage login=new LoginPage(driver);
		    login.login(UserName, Password);*/
		    
			//driver.findElement(By.name("user_name")).sendKeys(UserName);
			//driver.findElement(By.name("user_password")).sendKeys(Password);
			//driver.findElement(By.id("submitButton")).click();
		    
			HomePage home=new HomePage(driver);
	        home.ClickOrganizationLink();
	        //Assert.assertEquals(true, false);
	        
			//driver.findElement(By.linkText("Organizations")).click();
			//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			
			Java_Utility jlib1=new Java_Utility();
			int ranNum=jlib1.getRanDomNum();
			
			Excel_Utility elib1=new Excel_Utility();
			String data=elib1.getDataFromExcel("Sheet1",0,0)+ranNum;
			
			CreateOrganization org=new CreateOrganization(driver);
			org.getCreateOrgImg().click();
			org.organization(data);
			//driver.findElement(By.name("accountname")).sendKeys(data);
		    org.ClickSaveButton();
		    
			//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		    //SoftAssert soft=new SoftAssert();
		    //soft.assertEquals("B","B");
		    
			ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
			validate.organizationValidation(driver,data);
			/*String actData=driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
			if(actData.contains(data))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("Fail");
			}*/
		     home.ClickAdminLink();
			home.moveToSignOutBtn(driver);
			//soft.assertAll();
			//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	        //driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	

}
