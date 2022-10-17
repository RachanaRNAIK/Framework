package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws Throwable {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./commondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");
		String UserName=pro.getProperty("un");
		String Password=pro.getProperty("pw");
		driver.get(URL);
		driver.close();
		

	}

}
