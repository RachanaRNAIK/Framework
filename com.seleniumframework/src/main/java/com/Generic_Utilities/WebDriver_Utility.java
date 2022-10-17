package com.Generic_Utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	/**
	 * Wait for page to load before identifying any synchronized in DOM
	 * @author Rachana6
	 */
     public void waitForPageLoad(WebDriver driver)
     {
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     }
     /**
      * After every action it will for next action to perform 
      * @author Rachana6
      * @param driver
      */
     public void scriptTimeOut(WebDriver driver)
     {
    	 driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
     }
    /**
      * used to wait for element to be click able in GUI and check for specific element for every 500 milliseconds
      *
      */
     public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
     {
    	 FluentWait wait=new FluentWait(driver);
    	 wait.pollingEvery(Duration.ofSeconds(20));
    	 wait.until(ExpectedConditions.elementToBeClickable(Element));
     }
     /**
      * Used to switch to any window based on window title
      * @param driver
      * @param PartialWindowTitle
      * author Rachana6
      */
     public void switchToWindow(WebDriver driver,String PartialWindowTitle)
     {
    	 Set<String> allId=driver.getWindowHandles();
    	 Iterator<String> it=allId.iterator();
    	 while(it.hasNext())
    	 {
    		 String wid=it.next();
    		 driver.switchTo().window(wid);
    		 if(driver.getTitle().contains(PartialWindowTitle))
    		 {
    			 break;
    		 }
    	 }
     }
     public void switchBackWindow(WebDriver driver,String PartialWindowTitle)
     {
    	    Set<String> allId1=driver.getWindowHandles();
			Iterator<String> it1=allId1.iterator();
			while(it1.hasNext())
		         {
				String wid=it1.next();
			    driver.switchTo().window(wid);
				if(driver.getTitle().contains("Campaign&action"))
				{
				break;
				}}
     }
    		 /**
    		  * used to switch AlertWindow and accept(click on ok button)
    		  * @param driver
    		  * @author Rachana6
    		  */
    		 public void switchToAlertAndAccept(WebDriver driver)
    		 {
    			 
    			 driver.switchTo().alert().accept();
    		 }
    		 /**
    		  * used to switch to AlertWindow and dismiss(click on Cancel button)
    		  * @param driver
    		  * @author Rachana6
    		  */
    		 public void switchToAlertAndDismiss(WebDriver driver11)
    		 {
    			 driver11.switchTo().alert().dismiss();
    		 }
    		 /**
    		  * used to switch to frame window based on index
    		  * @param driver
    		  * @param index
    		  * @author Rachana6
    		  */
    		  public void switchToFrame(WebDriver driver11,int index)
    		 {
    			 driver11.switchTo().frame(index);
    		 }
    		 /**
    		  * 	used to switch to frame window based on id or name attribute
    		  * @param driver
    		  * @param id_name_attribute
    		  * @author Rachana6
    		  */
    		  public void switchToFrame(WebDriver driver,String id_name_Attribute)
    		  {
    			  driver.switchTo().frame(id_name_Attribute);
    		  }
    		  /**
    		   * used to select the value from the drop down based on index
    		   * @param element
    		   * @param index
    		   * @author Rachana6
    		   */
    		  public void select(WebElement element,int index)
    		  {
    			  Select sel=new Select(element);
    			  sel.selectByIndex(index);
    		  }
    		  /**
    		   * used to select the value from the dropdown based on text
    		   * @param element
    		   * @param text
    		   * @author Rachana6
    		   */
    		  public void select(WebElement element,String text)
    		  {
    			  Select sel=new Select(element);
    			  sel.selectByVisibleText(text);
    		  }
    		  /**
    		   * used to place mouse cursor on specified element
    		   * @param driver
    		   * @param element
    		   * @author Rachana6
    		   */
    		  
    		  public void mouseOverOnElement(WebDriver driver,WebElement element)
    		  {
    			  Actions act=new Actions(driver);
    			  act.moveToElement(element).perform();
    		  }
    		  /**
    		   * used to right click on specific element
    		   * @param driver
    		   * @param element
    		   * @author Rachana6
    		   */
    		  public void rightClickOnElement(WebDriver driver,WebElement element)
    		  {
    			  Actions act=new Actions(driver);
    			  act.contextClick(element).perform();
    		  }
    		  public void moveByOffSet(WebDriver driver,int x,int y)
    		  {
    			  Actions act=new Actions(driver);
    			  act.moveByOffset(x,y).click().perform();
    		  }
    		  public String takeScreenshot(WebDriver driver,String methodName)
    		  {
    			  return null;
    		  }
    	  
     }
