package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_Login_email;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_Login_password;
	
	@FindBy(xpath="//input[@value='Login']") WebElement Login_button;
	
	
	public void enteremail(String emailid)
	{
		txt_Login_email.sendKeys(emailid);
	}
	
	public void enterpassword(String password)
	{
		txt_Login_password.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		Login_button.click();
	}
	
}
