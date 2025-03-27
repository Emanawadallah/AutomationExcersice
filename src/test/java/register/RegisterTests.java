package register;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;

public class RegisterTests extends BaseTests {
    @Test
    public void registerUser() throws FileNotFoundException {
        LoginPage loginPage=homePage.clickOnLoginLink();
        loginPage.enterRegName(dataModel().registerData.regValidCredintials.Username);
        loginPage.enterRegEmail(dataModel().registerData.regValidCredintials.Email);
        RegisterPage registerPage=loginPage.clickOnRegSubmitButton();
        registerPage.clickOnMrsRadioButton();
        ///registerPage.enterName(dataModel().registerData.regValidCredintials.Username);
        //registerPage.enterEmail(dataModel().registerData.regValidCredintials.Email);
        registerPage.enterpass(dataModel().registerData.regValidCredintials.Password);
        registerPage.selectDay(dataModel().registerData.regValidCredintials.DaysValue);
        registerPage.selectMonth(dataModel().registerData.regValidCredintials.MonthsValue);
        registerPage.selectYear(dataModel().registerData.regValidCredintials.YearsValue);
        registerPage.clickOnNewLetterCheckBox();
        registerPage.clickOnOptin();
        registerPage.enterFirstName(dataModel().registerData.regValidCredintials.Fname);
        registerPage.enterLastName(dataModel().registerData.regValidCredintials.Lname);
        registerPage.enterCompany(dataModel().registerData.regValidCredintials.Company);
        registerPage.enterAdress1(dataModel().registerData.regValidCredintials.Address1);
        registerPage.enterAdress2(dataModel().registerData.regValidCredintials.Address2);
        registerPage.selectCountry(dataModel().registerData.regValidCredintials.CountryValue);
        registerPage.enterState(dataModel().registerData.regValidCredintials.State);
        registerPage.enterCity(dataModel().registerData.regValidCredintials.City);
        registerPage.enterZipCode(dataModel().registerData.regValidCredintials.Zipcode);
        registerPage.enterMobNum(dataModel().registerData.regValidCredintials.Mobilenum);
        AccountCretaedPage accountCretaedPage = registerPage.clickOnCreateAccountButton();
        String actualResult=accountCretaedPage.validationTilte();
        Assert.assertEquals(actualResult,"ACCOUNT CREATED!");
        HomeAfterRegAndLogin homeAfterRegAndLogin=accountCretaedPage.clickOnContinueButton();
        String actual1 =homeAfterRegAndLogin.validateLoggedInText();
        Assert.assertEquals(actual1,"Logged in as emann");
        String actualUname= homeAfterRegAndLogin.validateUserName();
        Assert.assertEquals(actualUname,dataModel().registerData.regValidCredintials.Username);
        DeletedAccountPage deletedAccountPage =homeAfterRegAndLogin.clickOnDeleteAccount();
        String actualTitle=deletedAccountPage.validationTitle();
        Assert.assertEquals(actualTitle,"ACCOUNT DELETED!");


    }

}
