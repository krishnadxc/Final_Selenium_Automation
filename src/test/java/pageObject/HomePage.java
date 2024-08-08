package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@title='My Account']") WebElement Myaccount_Link;
	
	@FindBy(xpath="//a[text()='Register']") WebElement Registration_link;
	
	@FindBy(xpath="//a[text()='Login']") WebElement Login_link;
	
	
	
	public void clickMyAccount()
	{
		Myaccount_Link.click();
	}
	
	public void clickRegistrationlink()
	{
		Registration_link.click();
	}
	
	public void clickonLogin()
	{
		Login_link.click();
	}
	
	
}
