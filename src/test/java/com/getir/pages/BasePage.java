package com.getir.pages;

import com.getir.step_definitions.Initialize;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    public BasePage(){
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,10);
    }
        public void getMenu(String menuName){
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+menuName+"']")).click();
    }
}
//import com.getir.step_definitions.Initialize;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BasePage {
//    public AndroidDriver driver;
//    public WebDriverWait wait;
//
//    public BasePage(){
//
//        driver= Initialize.driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
//        wait=new WebDriverWait(driver,15);
//
//    }
//
////android.widget.TextView[@text='İçecek']"
//}
////*[text()='SOMETEXT']
////*[@text()='SOMETEXT']
//

//
