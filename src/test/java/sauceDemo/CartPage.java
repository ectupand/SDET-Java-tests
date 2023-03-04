package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseSeleniumPage {
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement checkoutBtn;

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    public CheckoutPage goToCheckout(){
        checkoutBtn.click();
        return new CheckoutPage();
    }
}
