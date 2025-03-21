package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class RegisterPage extends MethodHandles {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By nameField= By.cssSelector("input[type='text']");
    private final By emailField= By.cssSelector("input[data-qa='signup-email']");
    private final By submitButton= By.cssSelector("input[data-qa='signup-submit']");

    public void enterName(String name)
    {
        sendKeys(nameField,name,2);
    }

    public void enterEmail(String email)
    {
        sendKeys(emailField,email,2);
    }

    public void clickOnSubmitButton()
    {
        click(submitButton,5);
    }

}
