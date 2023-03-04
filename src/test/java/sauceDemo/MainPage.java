package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class MainPage extends BaseSeleniumPage {
    @FindBy(id="user-name")
    private WebElement username;

    @FindBy(xpath="//input[@id='password']")
    private WebElement password;

    @FindBy(css="#login-button")
    private WebElement loginBtn;

    @FindBy(xpath = "//h3")
    private WebElement errorMsg;

    public MainPage(){
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public ProductsPage validLogIn(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        loginBtn.click();
        return new ProductsPage();
    }

    public MainPage invalidLogIn(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        loginBtn.click();
        return this;
    }

    public String getErrorMessage(){
        return errorMsg.getText();
    }

}
