package org.example.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class SkySignUpPage {

    WebDriver ldriver;
    public SkySignUpPage(WebDriver driver) {
        ldriver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(id = "signuplink")
         WebElement SignupBtn;
    public void clickonSignupButton(){
        SignupBtn.click();
    }



}
