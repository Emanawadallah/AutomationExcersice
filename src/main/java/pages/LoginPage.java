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

    public void enterEmail(String email)
    {
        sendKeys(emailField,email,2);

    }

    public void enterPassword(String password)
    {
        sendKeys(passwordField,password,2);

    }

    public void clickOnSubmitButton()
    {
        click(submitButton,5);
    }


}
