package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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
	 @FindBy(how =How.XPATH, using ="//div[@name='company'] //div[@class='text']")
	 WebElement Company;
	 @FindBy(how =How.XPATH, using ="//span[contains(text(),'Add')]")
	 WebElement AddCompany;
	 @FindBy(how =How.NAME, using ="products")
	 WebElement Products;
	 @FindBy(how =How.XPATH, using ="//span[contains(text(),'Add')]")
	 WebElement AddProducts;
	 @FindBy(how =How.XPATH, using ="//div[@name='contacts']")
	 WebElement Contacts;
	 @FindBy(how =How.XPATH, using ="//div[@name='contacts'] //span[contains(text(),'Naya')]")
	 WebElement AddContacts;
	 @FindBy(how =How.XPATH, using ="//div[@class='react-datepicker']")
	 WebElement DatePicker;

	public void createNewDeal() throws InterruptedException {
		Deals.click();
		Title.sendKeys("Software products");
		AssignedTo.click();
		Thread.sleep(3000);

		Company.sendKeys("Niraj");
		AddCompany.click();
		Products.sendKeys("CRM platform");
		AddProducts.click();
		Contacts.click();
		AddContacts.click();
		Select datePicker = new Select(DatePicker);
		datePicker.selectByVisibleText("Next Month");
		
	}	
}