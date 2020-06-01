package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.CRMBasePage;
import page.CRMDealPage;
import page.CRMLoginPage;
import page.CRMnavPage;
import util.CRMBrowserFactory;

public class CRMTest extends CRMBasePage {

	WebDriver driver;	

	@Test(priority = 1)
	public void createQuickDraft() throws InterruptedException {
		driver = CRMBrowserFactory.startBrowser();
		CRMLoginPage loginPage = PageFactory.initElements(driver, CRMLoginPage.class);
		loginPage.login("automationtestquality@gmail.com", "Automation12");
	}
	
	@Test(priority = 2)
	public void createDealTest() throws InterruptedException {
		driver = CRMBrowserFactory.startBrowser();
		CRMLoginPage loginPage = PageFactory.initElements(driver, CRMLoginPage.class);
		loginPage.login("automationtestquality@gmail.com", "Automation12");
		CRMnavPage navPage = PageFactory.initElements(driver, CRMnavPage.class);
		navPage.clickDeals();
		CRMDealPage dealPage = PageFactory.initElements(driver, CRMDealPage.class);
		dealPage.createNewDeal();
	}

}
