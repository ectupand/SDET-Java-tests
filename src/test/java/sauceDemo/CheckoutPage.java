package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BaseSeleniumPage {
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    private WebElement zip;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    private WebElement finishBtn;


    public CheckoutPage(){
        PageFactory.initElements(driver, this);
    }

    public CheckoutComplete checkoutFill(
            String firstNameValue,
            String lastNameValue,
            String zipValue
    ){
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        zip.sendKeys(zipValue);
        continueBtn.click();
        finishBtn.click();
        return new CheckoutComplete();
    }
}
