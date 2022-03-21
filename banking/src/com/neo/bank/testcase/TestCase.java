package com.neo.bank.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.bank.pageobject.LoginPage;

public class TestCase extends BaseClass
{
	@Test
	public void test()

	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUsername(username);
		logger.info("Entered username ");
		
		loginPage.setPassword(password);
		
		logger.info("Entered password ");
		
		loginPage.clickSubmit();
		logger.info("click submit button ");
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("login test passed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("login test fail ");
	}
	}
}