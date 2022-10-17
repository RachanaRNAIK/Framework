package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {

	
	@Test(dataProvider="dataProvider_test")
	public void companyDetails(String name,String phnum,String email) throws Throwable {
		String Key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe";
		System.setProperty(Key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		   
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		
		driver.findElement(By.name("company")).sendKeys(name);
		driver.findElement(By.id("phone")).sendKeys(phnum);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		driver.quit();
		//Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] dataProvider_test()
	{
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="XYZ";
		objArr[0][1]="9784224520";
		objArr[0][2]="agdays@gmail.com";
		
		objArr[1][0]="GGG";
		objArr[1][1]="9784224810";
		objArr[1][2]="agys@gmail.com";
		
		objArr[2][0]="ZZZ";
		objArr[2][1]="9784004520";
		objArr[2][2]="days@gmail.com";
		return objArr;
		
		
	}
}
