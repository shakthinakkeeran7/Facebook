package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public void LogIn(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return Email;
	}


	public void setEmail(WebElement email) {
		Email = email;
	}
	
	
	@FindBy(id="email")
	private
	
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	
	public WebElement getPassword() {
		return Password;
	}


	@FindBy(xpath ="//a[text()='Create new account']")
	WebElement CreateAccount;


	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	public void setCreateAccount(WebElement createAccount) {
		CreateAccount = createAccount;
	}
	
	
	
}
