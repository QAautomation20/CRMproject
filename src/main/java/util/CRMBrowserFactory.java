package util;

import java.util.concurrent.TimeUnit; //

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CRMBasePage;

public class CRMBrowserFactory extends CRMBasePage {
		static WebDriver driver;		
		
		public static WebDriver startBrowser() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
			driver.get("https://freecrm.com/");
			driver.manage().window().maximize();
			return driver;
		}
}
