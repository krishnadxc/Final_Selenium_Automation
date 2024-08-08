package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage
{
	public AccountRegistration(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']") WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']") WebElement LastName;
	
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	
	@FindBy(xpath="//input[@name='telephone']") WebElement Telephone_number;
	
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	
	@FindBy(xpath="//input[@name='confirm']") WebElement ConfirmPassword;     
	
	@FindBy(xpath="//input[@name='agree']") WebElement CheckBox;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement Submit_Button;    //email: kppp@gmail.com password: army
	
	@FindBy(xpath="//div[@id='content']/h1") WebElement msgConfirmation;
	
	
	//ACTION METHODS
	
	public void setfirstname(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setTele_ph_no(String phno)
	{
		Telephone_number.sendKeys(phno);
	}
	
	public void setpassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	
	public void setconfimpassword(String pwd)
	{
		ConfirmPassword.sendKeys(pwd);
	}
	
	public void clickcheckbox()
	{
		CheckBox.click();
	}
	
	public void clicksubmit()
	{
		Submit_Button.click();
	}
	
	public String getmsgConfirmation()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
