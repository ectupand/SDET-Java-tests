package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BaseSeleniumPage {
    @FindBy(css="#add-to-cart-sauce-labs-backpack")
    private WebElement firstProduct;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement cartBtn;



    public ProductsPage(){
        PageFactory.initElements(driver, this);
    }

    public CartPage addProductToCart(){
        firstProduct.click();
        cartBtn.click();
        return new CartPage();
    }
}
