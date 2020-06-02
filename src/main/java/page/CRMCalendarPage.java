package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CRMCalendarPage extends CRMBasePage {
	
	WebDriver driver;

	public CRMCalendarPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//span[text() = 'Calendar']")
	WebElement Calendar;
	@FindBy(how = How.XPATH, using = "//a[@href='/calendar/new']//i[@aria-hidden='true']")
	WebElement NewTask;
	@FindBy(how = How.NAME, using = "title")
	WebElement Title;
	@FindBy(how = How.XPATH, using = "//div[text() = 'Quality Automation <automationtestquality@gmail.com>' ]")
	WebElement Calen;
	@FindBy(how = How.XPATH, using = "//div[@class='ui active visible selection dropdown']//i[@class='dropdown icon']")
	WebElement Category;
	@FindBy(how = How.NAME, using = "description")
	WebElement Description;
	@FindBy(how = How.NAME, using = "location")
	WebElement Location;
	@FindBy(how = How.XPATH, using = "//div[@class='ui checked toggle checkbox']//child::label[text() = 'All Day' ]")
	WebElement AllDay;
	@FindBy(how = How.NAME, using = "identifier")
	WebElement Identifier;
	@FindBy(how = How.XPATH, using = "//i[@class='save icon']")
	WebElement SaveIcon;
	
	public void ClickCalendar () {
		Calendar.click();
	}
	public void Newtask () {
		NewTask.click();
	}
	
	
	public void FillCalendarPage(String title, String description, String location, String identifier) {
		
		Title.sendKeys(title);
		Calen.click();
		Category.findElement(By.xpath("//div[text()= 'Important']")).click();
		Description.sendKeys(description);
		Location.sendKeys(location);
		AllDay.click();
		Identifier.sendKeys(identifier);
	}
	public void SaveEvent() {	
		SaveIcon.click();
		
	}
}
