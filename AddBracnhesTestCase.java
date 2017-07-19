package org.shiksha.fleet.feature;

import org.junit.Assert;
import org.shiksha.fleet.Main.DriverConfiguration;
import org.shiksha.fleet.pom.AddBranches;
import org.shiksha.fleet.pom.CreateSchedule;
import org.shiksha.fleet.pom.ShowSchedulePage;
import org.shiksha.fleet.pom.LoginPage;
import org.shiksha.fleet.pom.ShowRoute;
import org.shiksha.fleet.utility.ExcelUtils;
import org.shiksha.fleet.utility.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddBracnhesTestCase extends DriverConfiguration{
	@BeforeClass
	public void beforeClass() {
		LoginPage login = new LoginPage();
		String UserName = null;
		String Password = null;
		UserName = ExcelUtils.getData(7, 1, 6);
		Password = ExcelUtils.getData(7, 2, 6);
		LoginPage.enterUserName(driver, UserName);
		LoginPage.enterPassword(driver, Password);
		LoginPage.login(driver);
	}
	
	@Test(priority = 48, description = "click on Add Branch")
	public void clickOnAddBranch(){
		AddBranches abObject = new AddBranches();
		abObject.clickOnBrachesAndThenShowBranches(driver);
	}
	
	@Test(priority = 49, description = "Verify Branch Name field")
	public void verifyBranchName() throws InterruptedException{
		AddBranches abObject = new AddBranches();
		abObject.typeBranchName(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please enter branch address");
		}
		catch(Exception e){
			Log.error("Strinng Missmatch -Please enter branch address-"+e);
		}
	}
	
	@Test(priority = 50, description = "Verify Branch Address")
	public void verifyBranchAddress () throws InterruptedException{
		AddBranches abObject = new AddBranches();
		driver.navigate().refresh();
		abObject.typeBranchName(driver);
		abObject.typeBranchAddress(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please enter Latitude");
		}
		catch(Exception e){
			Log.error("Strinng Missmatch -Please enter Latitude- "+e);
		}
	}
	
	@Test(priority = 51, description = "Help-Desk Email")
	public void verifyHelpDeskEmail() throws InterruptedException{
		AddBranches abObject = new AddBranches();
		driver.navigate().refresh();
		abObject.typeBranchName(driver);
		abObject.typeBranchAddress(driver);
		abObject.typeBranchHelpDeskMail(driver);
		Thread.sleep(8000);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email : "+e);
		}
	}
	
	@Test(priority = 51, description = "Help-Desk Number")
	public void verifyHelpDeskNumber(){
		AddBranches abObject = new AddBranches();
		abObject.typeBranchHelpDeskNumber(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email- "+e);
		}
	}
	
	@Test(priority = 52, description = "Help-Desk Person")
	public void verifyHelpDeskPerson(){
		AddBranches abObject = new AddBranches();
		abObject.typeBranchHelpDeskPerson(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email- "+e);
		}
	}
	
	@Test(priority = 53, description = "Help-Desk Email2")
	public void verifyHelpDeskEmail2(){
		AddBranches abObject = new AddBranches();
		abObject.typeBranchHelpDeskMail2(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email- "+e);
		}
	}
	
	@Test(priority = 53, description = "Help-Desk Number2")
	public void verifyHelpDeskNumber2(){
		AddBranches abObject = new AddBranches();
		abObject.typeBranchHelpDeskNumber2(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email- "+e);
		}
	}
	
	@Test(priority = 54, description = "Help-Desk Person2")
	public void verifyHelpDeskPerson2(){
		AddBranches abObject = new AddBranches();
		abObject.typeBranchHelpDeskPerson2(driver);
		abObject.clickbtnSubmit(driver);
		String Value = LoginPage.AlertWindow(driver);
		try{
			Assert.assertEquals(Value, "Please Enter The Help Desk Number,Person,Email");
		}
		catch(Exception e){
			System.out.println("Strinng Missmatch -Please Enter The Help Desk Number,Person,Email- "+e);
		}
	}	
}
