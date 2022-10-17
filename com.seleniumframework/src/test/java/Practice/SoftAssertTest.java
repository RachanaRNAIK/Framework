package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class SoftAssertTest {
@Test
	public void CreateCustomerTest()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("B","B");
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
	}
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("---------------");
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
	}
}
