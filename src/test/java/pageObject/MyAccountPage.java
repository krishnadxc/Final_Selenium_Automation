package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']/h2[text()='My Account']") WebElement msgHeading;
	
	@FindBy(xpath="//*[contains(@href, 'route=account/logout') and @class='list-group-item']") WebElement Logout_link;
	
	public boolean msgformyaccount()
	{
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return (false);
		}
		
	}
	
	public void logout_button()
	{
		Logout_link.click();
	}
}
