package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    AndroidDriver<AndroidElement> driver;

    public LoginPage() {
    }
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }




//    MobileElement userM = driver.findElement(By.id("com.getir.casestudy.dev:id/usernameEditText"));
//    MobileElement passM=driver.findElement(By.id("com.getir.casestudy.dev:id/passwordEditText"));
//    MobileElement subM=driver.findElement(By.id("com.getir.casestudy.dev:id/loginButton"));

    @AndroidFindBy(id = "com.getir.casestudy.dev:id/usernameEditText")
    public AndroidElement username;

    @AndroidFindBy(id = "com.getir.casestudy.dev:id/passwordEditText")
    public AndroidElement password;

    @AndroidFindBy(id = "com.getir.casestudy.dev:id/loginButton")
    public AndroidElement submit;


    public void login(){
        username.sendKeys("hello@getir.com");
        password.sendKeys("hello");
        submit.click();
    }
}
