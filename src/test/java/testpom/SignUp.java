package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	public void SignUP(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	@FindBy(name = "firstname")
	WebElement Firstname;
	
	public WebElement getFirstname() {
		return Firstname;
	}

	
	@FindBy(name="lastname")
	WebElement LastName;
	
	public WebElement getLastName() {
		return LastName;
	}
	
	
}