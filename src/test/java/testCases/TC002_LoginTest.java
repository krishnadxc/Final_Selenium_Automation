package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class TC002_LoginTest extends BaseClass
{
	@Test(groups= {"sanity","master"})
	public void verify_login()
	{
		logger.info("** Started TC002_Login_Test**");
		try
		{
		//homepage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickonLogin();
		
		logger.info("home page actions completed");
		
		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.enteremail(p.getProperty("email"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickonLogin();
		logger.info("my login page actions completed");
		
		//myaccountpage
		MyAccountPage myacc=new MyAccountPage(driver);
		logger.info("Validating the text...");
		boolean targetpage=myacc.msgformyaccount();
		Assert.assertTrue(targetpage);
		logger.info("login successful, text is matching");
		}
		catch(Exception e)
		{
			logger.error("Error logs....");
			Assert.fail();
		}
		
		logger.info("** Finished TC002_Login_Test**");
	}
}
