package com.getir.step_definitions;

import com.getir.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BasketStepDef {
    AppiumDriver<MobileElement> driver;
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    LoginPage loginPage = new LoginPage();


    @Given("The user on the login page")
    public void the_user_on_the_login_page() throws MalformedURLException, InterruptedException {
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);

        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"8.0");

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");

        //set your application's package name
      //  desiredCapabilities.setCapability("appPackage","com.getir");
        //com.getir-4iBycty1tdT0mP6mvvC_8w==/base.apk
        //set your application's Main Activity i . e the Launcher activity name

    //    desiredCapabilities.setCapability("appActivity","com.getir.core.ui.controller.activity.MainActivity");
        desiredCapabilities.setCapability("app","https://cdn.getir.com/misc/case-studies/getir-testing-case-study.apk");

        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);


    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
     //   loginPage.username.sendKeys("hello@getir.com");
        loginPage.password.sendKeys("hello");
        loginPage.submit.click();

        Thread.sleep(4000);
        driver.closeApp();
        driver.quit();

        System.out.println("well done");

    }



}
