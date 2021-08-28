package com.Mercury;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	
	
	public static String getConfig(String key) throws IOException {
		Properties pro = new Properties();
		File file = new File("C:\\Users\\erp_w\\eclipse-workspace\\MercuryTours\\src\\test\\resources\\config\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		pro.load(fileInput);
		return pro.getProperty(key);
	}
}
