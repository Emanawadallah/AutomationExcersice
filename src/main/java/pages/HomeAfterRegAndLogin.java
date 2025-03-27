package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomeAfterRegAndLogin extends MethodHandles {
    public HomeAfterRegAndLogin(WebDriver driver) {
        super(driver);
    }
    private final By loggedInText =By.xpath("//a[contains(text(),'Logged in as ')]");
    private final By userName=By.xpath("//a[contains(text(),'Logged in as ')] //b");
    private final By deleteButton=By.xpath("//a[@href='/delete_account'] ");

    public String validateLoggedInText()
    {
        return webElement(loggedInText).getText();
    }

    public String validateUserName()
    {
        return webElement(userName).getText();
    }

    public DeletedAccountPage clickOnDeleteAccount()
    {
        click(deleteButton,5);
        return new DeletedAccountPage(driver);
    }

}
