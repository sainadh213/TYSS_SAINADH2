package com.VTiger.generic;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtil {
	@Test
	/*public void createRandomnumber() {
	Random random = new Random();
	int number=random.nextInt(150);
	System.out.println(number);
	double db = random.nextDouble();
	System.out.println(db);*/
	/*public void createRandomnumber() {
		Random random = new Random();
		int number=random.nextInt(1002);
		System.out.println(number);
	}
	{	
		public int createRandomnumber1() {
			Random random = new Random();
			int number=random.nextInt(1002);
			return number;
		}

		public String getDate() {
			Date date = new Date();
			return date.toString();
		}*/
	public int createRandomnumber() {
		Random random = new Random();
		int number=random.nextInt(1002);
		return number;
	}
	
	public String getDate() {
		Date date = new Date();
		return date.toString();
	}

}


