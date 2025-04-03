package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DeletedAccountPage;
import pages.HomeAfterRegAndLogin;
import pages.HomePage;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;


public class LoginTests extends BaseTests {

    @DataProvider
    public Object[][] dataProvider() throws FileNotFoundException {
        return dataModel().loginDataProvider  ;
    }
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
       Assert.assertEquals(actual1,"Logged In as eman");
       String actualUname= homeAfterRegAndLogin.validateUserName();
       Assert.assertEquals(actualUname,dataModel().registerData.regValidCredintials.Username);
       DeletedAccountPage deletedAccountPage =homeAfterRegAndLogin.clickOnDeleteAccount();
       String actualTitle=deletedAccountPage.validationTitle();
       Assert.assertEquals(actualTitle,"Account Deleted!");
   }

    @Test (dataProvider = "dataProvider")
    public void loginUserWithWrongEmailAndPassword(String userName, String password) throws FileNotFoundException {
        LoginPage loginPage=homePage.clickOnLoginLink();
        String actualResult = loginPage.getTitle();
        String expectedResult="Login to your account";
        Assert.assertEquals(actualResult,expectedResult);
        loginPage.enterEmail(userName);
        loginPage.enterPassword(password);
        HomeAfterRegAndLogin homeAfterRegAndLogin=loginPage.clickOnSubmitButton();
        String actualResult2 = loginPage.getValidationMessage();
        Assert.assertEquals(actualResult2,"Your email or password is incorrect!");
    }

    @Test
    public void logoutUser() throws FileNotFoundException {
        LoginPage loginPage = homePage.clickOnLoginLink();
        String actualResult = loginPage.getTitle();
        String expectedResult = "Login to your account";
        Assert.assertEquals(actualResult, expectedResult);
        loginPage.enterEmail(dataModel().loginData.validCredintials.Username);
        loginPage.enterPassword(dataModel().loginData.validCredintials.Password);
        HomeAfterRegAndLogin homeAfterRegAndLogin=loginPage.clickOnSubmitButton();
        String actual1 =homeAfterRegAndLogin.validateLoggedInText();
        Assert.assertEquals(actual1,"Logged in as eman");
        String actualUname= homeAfterRegAndLogin.validateUserName();
        Assert.assertEquals(actualUname,"eman");
        LoginPage loginPageAfterLogout= homeAfterRegAndLogin.clickOnLogoutButton();
        String actualAfterLogout =loginPageAfterLogout.getTitle();
        Assert.assertEquals(actualAfterLogout,"Login to your account");


    }



    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }

    @Test (dataProvider = "dataProvider")
    public void tcDataProvider(String username,String password)
    {
        System.out.println(username);
        System.out.println(password);
    }
}
