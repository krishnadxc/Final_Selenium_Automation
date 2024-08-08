package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups=("datadriven")) //getting dataprovider from different class
	public void verify_loginDDT(String email, String pwd,String exp)
	{
		logger.info("** Started Login DataDriven Test **");
		try
		{
		//homepage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickonLogin();
				
		logger.info("home page actions completed");
				
		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.enteremail(email);
		lp.enterpassword(pwd);
		lp.clickonLogin();
		logger.info("my login page actions completed");
				
		//myaccountpage
		MyAccountPage myacc=new MyAccountPage(driver);
		logger.info("Validating the text...");
		boolean targetpage=myacc.msgformyaccount();
		
		
		/*
		 Data is valid - login success - test pass - logout
		                 login fail    - Test fail
		                 
		 Data is invalid - login success - test fail - logout
		 				   login fail - test pass 
		 */
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				myacc.logout_button();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				myacc.logout_button();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("** Finished Login DataDriven Test **");
	}
}
