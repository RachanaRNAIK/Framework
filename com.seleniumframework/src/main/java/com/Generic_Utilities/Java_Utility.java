package com.Generic_Utilities;

import java.util.Random;

public class Java_Utility {
	/**
	 * This method is used to avoid duplicate values
	 * @return
	 *@author Rachana6
	 */
	public int getRanDomNum()
	{
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		return ranNum;
	}
	

}
