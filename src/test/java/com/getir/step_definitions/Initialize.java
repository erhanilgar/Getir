package com.getir.step_definitions;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.net.URL;

public class Initialize {
    public static AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @Before
    public  void setup() {
        initializeDriver();
        wait=new WebDriverWait(driver,10);
        driver.resetApp();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }
        driver.quit();
    }

    public void initializeDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        desiredCapabilities.setCapability("appPackage", "com.getir.casestudy.dev");
        desiredCapabilities.setCapability("appActivity", "com.getir.casestudy.modules.splash.ui.SplashActivity");

        //  desiredCapabilities.setCapability("app","https://cdn.getir.com/misc/case-studies/getir-testing-case-study.apk");

        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

