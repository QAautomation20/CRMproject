package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.CRMBasePage;
import page.CRMLoginPage;
import page.CreateNewContactPage;
import page.SideNavigation;
import util.CRMBrowserFactory;

public class CRMTest extends CRMBasePage {

	WebDriver driver;	

	@Test
	public void createQuickDraft() throws InterruptedException {
		driver = CRMBrowserFactory.startBrowser();

		CRMLoginPage loginPage = PageFactory.initElements(driver, CRMLoginPage.class);
		loginPage.login("automationtestquality@gmail.com", "Automation12");
		
		
		SideNavigation sideNavigation = PageFactory.initElements(driver, SideNavigation.class);
		sideNavigation.clickContacts();
	    driver.manage().window().maximize();
		Thread.sleep(3000);
		sideNavigation.clickNewButton();
		
		CreateNewContactPage createNewContactPage = PageFactory.initElements(driver, CreateNewContactPage.class);
		createNewContactPage.fillInfo("NayaManchee3","NA", "NewClient", "Practicing Selenium!" );
		Thread.sleep(6000);
		createNewContactPage.clickSaveButton();
		
			
	}
	
	}