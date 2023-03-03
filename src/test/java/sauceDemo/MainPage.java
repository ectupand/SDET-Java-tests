package sauceDemo;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
    //private final By username = By.id("user-name");
    //private final By password = By.xpath("//select[@id='password']");

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(xpath = "//select[@id='password']")
    private WebElement password;

    public MainPage(){
        driver.get()
        PageFactory.initElements(driver, this);
    }

}
