package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.Lib;
import com.actitime.pompages.LoginPage;

public class TestInvalidLogin extends BaseTest{

	@Test
	public void testInvalidLogin(){
		
		LoginPage l = new LoginPage(driver);
		int rowCount = Lib.getRowCount("InvalidLogin");
		System.out.println(rowCount);
		
		for (int i = 1; i <= rowCount; i++) {
			String username = Lib.getCellValue("InvalidLogin", i, 0);
			//enter uname
			l.setUsername(username);
			//enter pwd
			String password = Lib.getCellValue("InvalidLogin", i, 1);
			l.setPassword(password);
			//click on Login button
			l.clickLogin();
		}
		
		
	
	}
	
	
}
