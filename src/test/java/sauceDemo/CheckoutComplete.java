package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplete extends BaseSeleniumPage {
    @FindBy(xpath = "//h2")
    private WebElement successMsg;

    public CheckoutComplete(){
        PageFactory.initElements(driver, this);
    }

    public static String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getSuccessMessage(){
        return successMsg.getText();
    }
}
