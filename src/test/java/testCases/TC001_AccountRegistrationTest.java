package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistration;
import pageObject.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass
{
	
	@Test(groups= {"regression","master"})
	void verify_account_registration()
	{
		logger.info("*Started the Test case*");
		try
		{
		
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my account");
		hp.clickRegistrationlink();
		logger.info("Clicked on register link");
		
		AccountRegistration reg=new AccountRegistration(driver);
		logger.info("Entering customer details");
		
		reg.setfirstname(randomstring().toUpperCase());
		reg.setlastname(randomstring().toUpperCase());
		reg.setemail(randomstring()+"@gmail.com");
		reg.setTele_ph_no(randomnumber());
		
		String password=randomalphanumeric();
		reg.setpassword(password);
		reg.setconfimpassword(password);
		
		reg.clickcheckbox();
		reg.clicksubmit();
		
		logger.info("*Validating the message..");
		String conmsg=reg.getmsgConfirmation();
		if(conmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			Assert.fail();
		}
		logger.info("*Ended the Test case*");
		
	}
	
	
	
}
