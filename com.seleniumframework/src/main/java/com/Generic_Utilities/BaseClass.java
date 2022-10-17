package com.Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	    public static WebDriver sdriver;
	   public WebDriver driver;
	    @BeforeSuite(groups= {"smokeTest","regressionTest"})
		public void BS()
		{
			System.out.println("Database connection");
		}
	    @BeforeTest(groups= {"smokeTest","regressionTest"})
		public void BT()
		{
			System.out.println("Execute in parallel mode");
		}
	  // @Parameters("BROWSER")
	    @BeforeClass(groups= {"smokeTest","regressionTest"})
		//public void BC(String BROWSER) throws Throwable
	    public void BC() throws Throwable
		{
			File_Utility flib=new File_Utility();
		    String BROWSER=flib.getPropertyKeyValue1("browser");
			
				
				if(BROWSER.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
				}
				else if(BROWSER.equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
				else if(BROWSER.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
				}
				else 
				{
					driver=new ChromeDriver();
				}
				sdriver=driver;
				
			System.out.println("Launching the Browser");
		}
	    @BeforeMethod(groups= {"smokeTest","regressionTest"})
		public void BM() throws Throwable
		{
	    	File_Utility flib=new File_Utility();
			String URL=flib.getPropertyKeyValue1("url");
			String UserName=flib.getPropertyKeyValue1("un");
			String Password=flib.getPropertyKeyValue1("pw");
		    driver.get(URL);
		    
		    LoginPage login=new LoginPage(driver);
		    login.login(UserName, Password);
	    	System.out.println("Login to Application");
		}
	    @AfterMethod(groups= {"smokeTest","regressionTest"})
		public void AM()
		{
			System.out.println("Logout the appliaction");
		}
	   @AfterClass(groups= {"smokeTest","regressionTest"})
		public void AC()
		{
			System.out.println("Close the Browser");
		}
	    @AfterTest(groups= {"smokeTest","regressionTest"})
		public void AT()
		{
			System.out.println("Executed successfully");
		}
	    @AfterSuite(groups= {"smokeTest","regressionTest"})
	    public void AS()
	    {
	    	System.out.println("Database close");
	    }
	}


