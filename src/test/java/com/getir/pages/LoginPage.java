package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    @FindBy(id = "com.getir.casestudy.dev:id/usernameEditText")
    public AndroidElement username;

    @FindBy(id = "com.getir.casestudy.dev:id/passwordEditText")
    public AndroidElement password;

    @FindBy(id = "com.getir.casestudy.dev:id/loginButton")
    public AndroidElement submit;

    public void login()  {
        waitUntil(username).sendKeys("hello@getir.com");
        waitUntil(password).sendKeys("hello");
        submit.click();
    }

    public AndroidElement waitUntil(AndroidElement element){
        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

}

//import io.appium.java_client.android.AndroidElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class LoginPage extends BasePage {
//
//public LoginPage(){
//
//}
//
//
//
////    MobileElement username = (MobileElement) driver.findElement(MobileBy.id("com.getir.casestudy.dev:id/usernameEditText"));
////    MobileElement password= (MobileElement) driver.findElement(By.id("com.getir.casestudy.dev:id/passwordEditText"));
////    MobileElement submit= (MobileElement) driver.findElement(By.id("com.getir.casestudy.dev:id/loginButton"));
//
//
//    @FindBy(id = "com.getir.casestudy.dev:id/usernameEditText")
//    public AndroidElement username;
//
//    @FindBy(id = "com.getir.casestudy.dev:id/passwordEditText")
//    public AndroidElement password;
//
//    @FindBy(id = "com.getir.casestudy.dev:id/loginButton")
//    public AndroidElement submit;
//
//
//    public void login()  {
//        waitUntil(username).sendKeys("hello@getir.com");
//        waitUntil(password).sendKeys("hello");
//        submit.click();
//    }
//
//    private AndroidElement waitUntil(AndroidElement element){
//        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//}
