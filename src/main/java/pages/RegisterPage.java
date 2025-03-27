package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandles;

public class RegisterPage extends MethodHandles {

     Select select;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By radioButtonMr=By.id("id_gender1");
    private final By radioButtonMrs=By.id("id_gender2");
    private final By nameField=By.id("name");
    private final By emailField=By.id("email");
    private final By passField=By.id("password");
    private final By daysList=By.cssSelector("#days");
    private final By monthsList=By.id("months");
    private final By yearsList=By.id("years");
    private final By checkBoxNewLetter=By.id("newsletter");
    private final By checkBoxOptin=By.id("optin");
    private final By fNameField=By.id("first_name");
    private final By lNameField=By.id("last_name");
    private final By companyField=By.id("company");
    private final By address1Field=By.id("address1");
    private final By address2Field=By.id("address2");
    private final By countryList=By.id("country");
    private final By stateField=By.id("state");
    private final By cityField=By.id("city");
    private final By zipCodeField=By.id("zipcode");
    private final By mobNumField=By.id("mobile_number");
    private final By createAccountButton=By.xpath("//button[text()='Create Account']");

     public void clickOnMrRadioButton()
    {
        click(radioButtonMr,2);
    }

    public void clickOnMrsRadioButton()
    {
        click(radioButtonMrs,2);
    }

    public void enterName(String name)
    {
        sendKeys(nameField,name,2);
    }

    public void enterEmail(String mail)
    {
        sendKeys(emailField,mail,2);
    }

    public void enterpass(String pass)
    {
        sendKeys(passField,pass,2);
    }

    public void createObjectFromSelect(By locator)
    {
        select=new Select(webElement(locator));
    }

    public void selectDay(String value)
    {
        createObjectFromSelect(daysList);
        click(daysList,2);
        select.selectByValue(value);
    }

    public void selectMonth(String value)
    {
        createObjectFromSelect(monthsList);
        click(monthsList,2);
        select.selectByValue(value);
    }

    public void selectYear(String value)
    {
        createObjectFromSelect(yearsList);
        click(yearsList,2);
        select.selectByValue(value);
    }

    public void clickOnNewLetterCheckBox()
    {
        click(checkBoxNewLetter,2);
    }

    public void clickOnOptin()
    {
        click(checkBoxOptin,2);
    }

    public void enterFirstName(String firstname)
    {
        sendKeys(fNameField,firstname,2);
    }

    public void enterLastName(String lastname)
    {
        sendKeys(lNameField,lastname,2);
    }

    public void enterCompany(String company)
    {
        sendKeys(companyField,company,2);
    }

    public void enterAdress1(String address1)
    {
        sendKeys(address1Field,address1,2);
    }

    public void enterAdress2(String address2)
    {
        sendKeys(address2Field,address2,2);
    }

    public void selectCountry(String value)
    {
        createObjectFromSelect(countryList);
        click(countryList,2);
        select.selectByValue(value);
    }

    public void enterState(String state)
    {
        sendKeys(stateField,state,2);
    }

    public void enterCity(String city)
    {
        sendKeys(cityField,city,2);
    }

    public void enterZipCode(String zipCode)
    {
        sendKeys(zipCodeField,zipCode,2);
    }

    public void enterMobNum(String mobileNum)
    {
        sendKeys(mobNumField,mobileNum,2);
    }

    public AccountCretaedPage clickOnCreateAccountButton()
    {
        click(createAccountButton,5);
        return new AccountCretaedPage(driver);
    }
}
