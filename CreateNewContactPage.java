package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewContactPage 
{
		WebDriver driver;
		// Every Page must have a constructor to invite the driver
		 public CreateNewContactPage(WebDriver driver)
		  {
		    this.driver = driver;
		  }
		 
		 //element Library
		 @FindBy(how=How.NAME, using="first_name")
		 WebElement FirstName;
		 @FindBy(how=How.NAME, using="last_name")
		 WebElement LastName;
		 @FindBy(how=How.NAME, using="middle_name")
		 WebElement MiddleName;
		// @FindBy(how=How.CLASS_NAME, using="search")
		// WebElement Company;
		 @FindBy(how=How.NAME, using="description")
		 WebElement Description;
		 
	 
		 @FindBy(how=How.XPATH, using="//*[@class='ui linkedin button']")
		 WebElement SaveButton;
		 
		// Methods to interact with the elements
			
		 public void fillInfo(String firstname, String middlename, String lastname, String description)
		 {			
			 FirstName.sendKeys(firstname);
			 MiddleName.sendKeys(middlename);
			 LastName.sendKeys(lastname);
			 //Company.sendKeys(company);
			 Description.sendKeys(description);
			 
		 }
		 
		 public void clickSaveButton()
		 {			
			 SaveButton.click();
		 }
		 
}

