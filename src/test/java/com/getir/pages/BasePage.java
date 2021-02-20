package com.getir.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    AndroidDriver<AndroidElement> driver;
    public BasePage() {
    }
    public BasePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }




    //*[text()='SOMETEXT']
    //*[@text()='SOMETEXT']

    public void getMenu(String menuName){
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+menuName+"']")).click();
    }








}
