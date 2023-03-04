package sauceDemo;

import core.BaseSeleniumTest;
import helpers.TestValues;
import org.junit.Assert;
import org.junit.Test;

public class SauceDemoTest extends BaseSeleniumTest {

    @Test
    public void checkSuccessBuy(){
        CheckoutComplete checkoutComplete = new MainPage()
                .validLogIn(TestValues.SUCCESS_USERNAME, TestValues.SUCCESS_PASSWORD)
                .addProductToCart()
                .goToCheckout()
                .checkoutFill(TestValues.FIRSTNAME, TestValues.LASTNAME, TestValues.ZIP);

        Assert.assertEquals(TestValues.REDIRECT_URL, CheckoutComplete.getUrl());
        Assert.assertEquals(TestValues.CHECKOUT_SUCCESS_MESSAGE, checkoutComplete.getSuccessMessage());
    }

    @Test
    public void checkErrorOnInvalidLogin(){
        MainPage login = new MainPage().
                invalidLogIn(TestValues.FAIL_USERNAME, TestValues.FAIL_PASSWORD);
        Assert.assertEquals(TestValues.LOGIN_FAIL_MESSAGE, login.getErrorMessage());
    }
}
