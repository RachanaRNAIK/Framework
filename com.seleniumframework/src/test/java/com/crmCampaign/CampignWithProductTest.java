package com.crmCampaign;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_Utilities.BaseClass;
import com.Generic_Utilities.Excel_Utility;
import com.Generic_Utilities.Java_Utility;
import com.Generic_Utilities.WebDriver_Utility;
import com.ObjectRepository.CampaignWithProduct;
import com.ObjectRepository.CreateCampaign;
import com.ObjectRepository.CreateProduct;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.ValidationAndVerificationPage;
@Test
public class CampignWithProductTest extends BaseClass {
@Test
public void CampignWithProductTest() throws Throwable {
/*String Key="webdriver.chrome.driver";
String value="C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
System.setProperty(Key, value);
WebDriver driver=new ChromeDriver();*/
	WebDriver_Utility wlib=new WebDriver_Utility();
	wlib.waitForPageLoad(driver);
	
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

/*FileInputStream fis=new FileInputStream("./commondata.properties.txt");
Properties pro=new Properties();
pro.load(fis);
String URL = pro.getProperty("url");
String UserName = pro.getProperty("un");
String PassWord = pro.getProperty("pw");
driver.get(URL);
driver.findElement(By.name("user_name")).sendKeys(UserName);
driver.findElement(By.name("user_password")).sendKeys(PassWord);
driver.findElement(By.id("submitButton")).click();*/

//product data
HomePage home=new HomePage(driver);
home.ClickProductLink();
home.ClickProductLink();
//driver.findElement(By.linkText("Products")).click();
CampaignWithProduct cmp=new CampaignWithProduct(driver);
cmp.getCreateProductbtn().click();

//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();


Java_Utility jlib=new Java_Utility();
int ranNum=jlib.getRanDomNum();

Excel_Utility elib=new Excel_Utility();
String productdata=elib.getDataFromExcel("Sheet1",0,0)+ranNum;
CreateProduct pr=new CreateProduct(driver);
pr.createNewProduct(productdata);
//driver.findElement(By.name("productname")).sendKeys(productdata);
pr.ClickSave();
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//Navigate to Campaign
home.moveToMoreLinkText(driver);
//driver.findElement(By.linkText("More")).click();
home.ClickCampaignLink();
//driver.findElement(By.linkText("Campaigns")).click();
CreateCampaign cp=new CreateCampaign(driver);
cp.ClickCreateCamp();
//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();


Java_Utility jlib1=new Java_Utility();
int ranNum1=jlib1.getRanDomNum();

Excel_Utility elib1=new Excel_Utility();
String data=elib1.getDataFromExcel("Sheet1",0,0)+ranNum1;

cp.CreateNewCampaign(productdata);
//driver.findElement(By.name("campaignname")).sendKeys(data);

CampaignWithProduct ccp=new CampaignWithProduct(driver);
ccp.getSelect().click();
//driver.findElement(By.xpath("//img[@title='Select']")).click();
//Window Switching
WebDriver_Utility wlib1=new WebDriver_Utility();
wlib1.switchToWindow(driver,"Products&action");
/*Set<String> allId = driver.getWindowHandles();
Iterator<String> it=allId.iterator();
while(it.hasNext())
{
String wid = it.next();
driver.switchTo().window(wid);
if(driver.getTitle().contains("Products&action"))
{
break;
}}*/

ccp.SearchProduct(productdata);
ccp.getSearchbtn().click();


//driver.findElement(By.id("search_txt")).sendKeys(productdata);

//driver.findElement(By.name("search")).click();

//Dynamic Xpath
driver.findElement(By.xpath("//a[text()='"+productdata+"']")).click();

//Switch back Window
wlib1.switchBackWindow(driver,"Campaigns&action");
/*Set<String> allId1 = driver.getWindowHandles();
Iterator<String> it1=allId1.iterator();
while(it1.hasNext())
{
String wid = it1.next();
driver.switchTo().window(wid);
if(driver.getTitle().contains("Campaigns&action"))
{
break;
}}*/

cp.ClickSave();
//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//ValidationAndVerificationPage validate=new ValidationAndVerificationPage(driver);
//validate.campaignValidation(driver, data);
/*String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();

if(actData.contains(data))
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}*/

home.ClickAdminLink();
//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
home.getSignOutbtn().click();
//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();


}
}
