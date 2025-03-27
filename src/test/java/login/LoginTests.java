package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeletedAccountPage;
import pages.HomeAfterRegAndLogin;
import pages.HomePage;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;


public class LoginTests extends BaseTests {

   @Test
   public void loginUserWithCorrectEmailAndPassword() throws FileNotFoundException {
       LoginPage loginPage=homePage.clickOnLoginLink();
       String actualResult = loginPage.getTitle();
       String expectedResult="Login to your account";
       Assert.assertEquals(actualResult,expectedResult);
       loginPage.enterEmail(dataModel().loginData.validCredintials.Username);
       loginPage.enterPassword(dataModel().loginData.validCredintials.Password);
       HomeAfterRegAndLogin homeAfterRegAndLogin=loginPage.clickOnSubmitButton();
       String actual1 =homeAfterRegAndLogin.validateLoggedInText();
       Assert.assertEquals(actual1,"Logged In as ");
       String actualUname= homeAfterRegAndLogin.validateUserName();
       Assert.assertEquals(actualUname,dataModel().registerData.regValidCredintials.Username);
       DeletedAccountPage deletedAccountPage =homeAfterRegAndLogin.clickOnDeleteAccount();
       String actualTitle=deletedAccountPage.validationTitle();
       Assert.assertEquals(actualTitle,"Account Deleted!");
   }


    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }
}
