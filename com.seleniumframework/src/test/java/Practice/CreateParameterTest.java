package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateParameterTest {

	public void method() {
		 
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		WebDriver driver;
			
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
			String URL=System.getProperty("url");
			driver.get(URL);
			
			String Username=System.getProperty("url");
			driver.findElement(By.name("user_name")).sendKeys("UserName");
			
			String Pssword=System.getProperty("url");
			driver.findElement(By.name("user_password")).sendKeys("Password");
			
			driver.findElement(By.id("submitButton")).click();
}
}
