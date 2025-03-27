package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AccountCretaedPage extends MethodHandles {
    public AccountCretaedPage(WebDriver driver) {
        super(driver);
    }

    private final By title= By.xpath("//b[contains(text(),'Account Created!')]");
    private final By continueButton=By.xpath("//a[contains(text(),'Continue')]");

    public String validationTilte()
    {
        return webElement(title).getText();
    }

    public HomeAfterRegAndLogin clickOnContinueButton()
    {
        click(continueButton,5);
        return new HomeAfterRegAndLogin(driver);
    }
}
