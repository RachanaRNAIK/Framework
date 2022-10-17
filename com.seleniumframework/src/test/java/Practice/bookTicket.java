package Practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookTicket {

		public static void main(String[] args) throws Throwable {
			String key="webdriver.chrome.driver";
			String value="C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			FileInputStream fis=new FileInputStream("./data.txt");
			Properties pro=new Properties();
			pro.load(fis);
			String URL=pro.getProperty("url");
			String UserName=pro.getProperty("un");
			String Password=pro.getProperty("pw");
			driver.get(URL);
			
			//from
			        String srcCity="Mumbai, India";
				     WebElement src=driver.findElement(By.xpath("//input[@id='fromCity']"));
					 src.sendKeys("'"+srcCity+"'");
					 driver.findElement(By.xpath("//p[text()='"+srcCity+"']")).click();
			//To
				   String desCity="New Delhi, India";
				   WebElement des=driver.findElement(By.xpath("//input[@id='toCity']"));
				   des.sendKeys("'"+desCity+"'");
				   driver.findElement(By.xpath("//p[text()='"+desCity+"']")).click();
            
            driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
          driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
           String month="September 2022";
            String date="30";
            Thread.sleep(5000);
            
            String month1="October 2022";
            String date1="1";
            //Dynamic xpath
            //driver.findElement(By.xpath("//div[text()='"+month+
            	//p[text()='30']
}
}
