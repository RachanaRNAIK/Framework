package Practice;

import org.testng.annotations.Test;

public class Sample3 {
    @Test
	public void CreateCustomerTest()
	{
		System.out.println("Customer details Created");
		int[]arr= {1,2,3};
		System.out.println(arr[5]);
	}
    @Test(dependsOnMethods="CreateCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("customer details modified");
	}
   @Test(dependsOnMethods="CreateCustomerTest")
	public void deleteCustomer()
	{
		System.out.println("delete details modified");
	}
}
