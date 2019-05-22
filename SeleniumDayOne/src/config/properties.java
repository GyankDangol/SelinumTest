package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

import testOne.OpenUrl;

public class properties {
	 static Properties prop = new Properties();
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFiles();
	
	}
	public static void readPropertiesFile() {
		
		try {
			InputStream input = new FileInputStream("C:\\Java Practice\\SeleniumDayOne\\src\\config\\config.properties");
			prop.load(input);
			OpenUrl.browser = prop.getProperty("browser");
			System.out.println(OpenUrl.browser);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public static void writePropertiesFiles() {
		try {
			FileOutputStream output = new FileOutputStream("C:\\Java Practice\\SeleniumDayOne\\src\\config\\config.properties");
			prop.setProperty("Result","Pass");
			System.out.println(prop.setProperty("Result","Pass"));
			prop.store(output, null);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
