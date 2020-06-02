package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.CRMBasePage;
import page.CRMCalendarPage;
import page.CRMLoginPage;
import util.CRMBrowserFactory;

public class CRMTest extends CRMBasePage {

	WebDriver driver;	
	
	@BeforeTest
	public void StartBrowser() {
		driver = CRMBrowserFactory.startBrowser();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void login () throws InterruptedException {
		

		CRMLoginPage loginPage = PageFactory.initElements(driver, CRMLoginPage.class);

		loginPage.login("automationtestquality@gmail.com", "Automation12");		
	}
	@Test (priority = 2)
	public void CreateNewEvent() throws InterruptedException {
		
		CRMCalendarPage NewEvent = PageFactory.initElements(driver, CRMCalendarPage.class);
		NewEvent.ClickCalendar();
		Thread.sleep(3000);
		NewEvent.Newtask();	
		Thread.sleep(3000);
		NewEvent.FillCalendarPage("Birthday", "Practice_Test", "Denton", "Hello");
		
		
	//	NewEvent.SaveEvent();
		
	}

	}
