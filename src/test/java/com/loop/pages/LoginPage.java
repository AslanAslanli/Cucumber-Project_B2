package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (id = "input-14")
    public WebElement usernameInput;
    @FindBy (id = "input-15")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public LoginPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
