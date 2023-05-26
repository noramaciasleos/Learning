package test;

import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium {

	public static void main(String[] args) {
		String exePath= "./src/test/resources/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
	}

}
