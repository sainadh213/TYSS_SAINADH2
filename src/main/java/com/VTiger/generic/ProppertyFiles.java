package com.VTiger.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProppertyFiles 
{
	public String readDatafrompropertyfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\TYSS_SAINADH2\\SDET_06.properties");

		Properties prop = new Properties();
		prop.load(fis);

		return	prop.getProperty(key);

	}


}
