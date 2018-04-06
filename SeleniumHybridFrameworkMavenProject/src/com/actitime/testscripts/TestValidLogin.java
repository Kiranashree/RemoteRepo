package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Lib;
import com.actitime.pompages.LoginPage;

public class TestValidLogin extends BaseTest{

	@Test(priority=1)
	public void testValidLogin(){
		
		LoginPage l = new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		//enter uname
		l.setUsername(username);
		//enter pwd
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(password);
		//click on Login button
		l.clickLogin();
	
	}
	
	
}
