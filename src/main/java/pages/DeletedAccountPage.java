package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DeletedAccountPage extends MethodHandles {
    public DeletedAccountPage(WebDriver driver) {
        super(driver);
    }
    private final By pageTitle= By.xpath("//b[text()='Account Deleted!']");

    public String  validationTitle()
    {
        return webElement(pageTitle).getText();
    }
}
