package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.properties;

public class OpenUrl {
	public static String browser;
	static WebDriver driver;
	public static void main(String[] args) {
		//setBrowser();
		properties.readPropertiesFile();
		setBrowserconfi();
		runTest();
		properties.writePropertiesFiles();
	}

	//set Browser
	//set Browser Configuration
	//Run Test
/*
 * Description
 * @author Gyan
 * @Date 5-16-19
 */
	public static void setBrowser() {
		 browser="Chrome";

	}
	//This condition block sets browser configuration for Firefox browser
	public static void setBrowserconfi() {
		String ProjectLoacation =System.getProperty("user.dir");
		if (browser.contains("Firefox")) {
		System.setProperty("webdriver.chrome.driver", ProjectLoacation+"\\lib\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 }
		//This condition block sets browser configuration for Chrome browser
		if (browser.contains("Chrome")) {
		System.setProperty("webdriver.gecko.driver", ProjectLoacation+"\\lib\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
	}

	public static void runTest() {
		driver.get("http://gmail.com");
		//driver.close();
		//driver.quit();
	}
}
