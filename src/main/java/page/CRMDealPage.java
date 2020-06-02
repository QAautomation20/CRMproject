package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMDealPage {

	WebDriver driver;
	 public  CRMDealPage(WebDriver driver) {
		this.driver = driver;
	 }
	
	 @FindBy(how =How.XPATH, using ="//div[@class='item']/descendant::button[@class='ui linkedin button'][5]")
	 WebElement Deals;
	 @FindBy(how =How.XPATH, using ="//div[@class='ui header item mb5 light-black']")
	 WebElement CreateNewDeal;
	 @FindBy(how =How.XPATH, using ="//form[@class='ui form segment custom-form-container'] //input[@name='title']")
	 WebElement Title;
	 @FindBy(how =How.XPATH, using ="//div[@class='ui fluid selection dropdown'] //i[@class='dropdown icon']")
	 WebElement AssignedTo;
	 @FindBy(how =How.XPATH, using ="//div[@class='visible menu transition']")
	 WebElement QualityAutomation;
	 @FindBy(how =How.XPATH, using ="//div[@name='company']/input[@class='search']")
	 WebElement Company;
	 @FindBy(how =How.XPATH, using ="//div[@name='company']/descendant::div[@class='visible menu transition']")
	 WebElement AddCompany;
	 @FindBy(how =How.XPATH, using ="//div[@name='contacts']//input[@class='search']")
	 WebElement Contacts;
	 @FindBy(how =How.XPATH, using ="(//span[contains(text(),'Baigaan')])[3]")
	 WebElement SelectContacts;

	 @FindBy(how =How.XPATH, using ="//div[@class='react-datepicker__input-container']/input")
	 WebElement DatePicker;
	 @FindBy(how =How.XPATH, using ="//div[@class='react-datepicker__header']/div")
	 WebElement Month;
	 @FindBy(how =How.XPATH, using ="//div[@class='react-datepicker-popper'] //div[@class='react-datepicker__day react-datepicker__day--026']")
	 WebElement SelectDate;
	 @FindBy(how =How.XPATH, using ="//div[@class='react-datepicker__time-container '] //li[@class='react-datepicker__time-list-item '][5]")
	 WebElement SelectTime;
	public void createNewDeal() throws InterruptedException {
		Deals.click();
		Title.sendKeys("Software products");
		AssignedTo.click();
		Thread.sleep(3000);
		QualityAutomation.click();
		Company.sendKeys("Niraj");
		AddCompany.click();
		Contacts.click();
		Contacts.sendKeys("B");
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(SelectContacts));
		SelectContacts.click();
		DatePicker.click();
		SelectTime.click();
		//Month.sendKeys(Keys.ENTER);
		
	}	
}