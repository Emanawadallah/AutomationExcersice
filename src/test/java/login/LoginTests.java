package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

import static reader.ReadDataFromJson.dataModel;


public class LoginTests extends BaseTests {

    @Test
    public void enterCorrectdata()
    {
        LoginPage loginPage=homePage.clickOnLoginLink();
        loginPage.enterEmail("");
        loginPage.enterPassword("");
        loginPage.clickOnSubmitButton();

    }

    @Test
    public void t1() throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }
}
