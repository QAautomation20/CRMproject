package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// monitors or operate Side Navigation bar only 
public class SideNavigation 
{
   WebDriver driver;
	
	
	public SideNavigation(WebDriver driver) // Every Page must have a constructor to invite the driver
	  {
		this.driver = driver;
	  }
		
		 //  Element Library    Storing WebElements  
	  @FindBy(how = How.XPATH, using= "//span[text()='Contacts']")   
	  WebElement Contacts;  
	  
	// Create New Contact Button
			 @FindBy(how=How.LINK_TEXT, using="New")
			 WebElement CreateNewContactButton;
	 	  
	  public void clickContacts() throws InterruptedException
		{
			Contacts.click();
			Thread.sleep(2000);
		}	
	  
	  // Click on New Contact Button 
	  public void clickNewButton() throws InterruptedException
		{
		  CreateNewContactButton.click();
		}

}
