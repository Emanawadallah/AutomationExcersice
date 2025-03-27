package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField= By.cssSelector("input[type='email']");
    private final By passwordField = By.cssSelector("input[type='password']");
    private final By submitButton = By.cssSelector("button[type='submit']");
    private final By title = By.xpath("//h2[contains(text(),'Login to your account')]");
    private final By nameField= By.cssSelector("input[type='text']");
    private final By regEmailField= By.cssSelector("input[data-qa='signup-email']");
    private final By regSubmitButton= By.cssSelector("button[data-qa='signup-button']");

    public void enterRegName(String name)
    {
        sendKeys(nameField,name,2);
    }

    public void enterRegEmail(String email)
    {
        sendKeys(regEmailField,email,2);
    }

    public RegisterPage clickOnRegSubmitButton()
    {
        click(regSubmitButton,5);
        return new RegisterPage(driver);
    }

    public void enterEmail(String email)
    {
        sendKeys(emailField,email,2);

    }

    public void enterPassword(String password)
    {
        sendKeys(passwordField,password,2);

    }

    public HomeAfterRegAndLogin clickOnSubmitButton()
    {
        click(submitButton,5);
        return new HomeAfterRegAndLogin(driver);
    }

    public String getTitle()
    {
        return webElement(title).getText();
    }


}
