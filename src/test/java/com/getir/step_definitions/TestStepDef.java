package com.getir.step_definitions;

import com.getir.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestStepDef {
    AppiumDriver<MobileElement> driver;
    LoginPage loginPage= new LoginPage();
    @Test
    public void deneme() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability("deviceName","Samsung Galaxy S9 Plus HD GoogleAPI Emulator");
        desiredCapabilities.setCapability("deviceOrientation", "portrait");
        desiredCapabilities.setCapability("browserName", "");
        desiredCapabilities.setCapability("platformVersion","8.0");
        desiredCapabilities.setCapability("platformName","Android");

        desiredCapabilities.setCapability("app","https://cdn.getir.com/misc/case-studies/getir-testing-case-study.apk");
        driver = new AppiumDriver<>(new URL("https://erhanilgar:2868d308e6934a299f204797b221135f@ondemand.us-west-1.saucelabs.com:443/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);

        MobileElement user = driver.findElement(By.id("com.getir.casestudy.dev:id/usernameEditText"));
        MobileElement password= driver.findElement(By.id("com.getir.casestudy.dev:id/passwordEditText"));
        MobileElement submit = driver.findElement(By.id("com.getir.casestudy.dev:id/loginButton"));



        user.sendKeys("hello@getir.com");
        password.sendKeys("hello");
        submit.click();

        Thread.sleep(2000);
        MobileElement goBasket=  driver.findElement(By.id("com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton"));
        goBasket.click();
        MobileElement basketText= driver.findElement(By.id("com.getir.casestudy.dev:id/tvTitle"));
        System.out.println("basketText.getText() = " + basketText.getText());
        MobileElement navigateLeft = driver.findElement(By.id("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView"));
        navigateLeft.click();
        MobileElement atistirmalik= driver.findElement(By.xpath("//android.widget.TextView[@text='Atıştırmalık']"));
        atistirmalik.click();
        MobileElement addCikolatali=driver.findElement(By.id("com.getir.casestudy.dev:id/btnAdd"));
        addCikolatali.click();
        MobileElement addSaka = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView"));
        addSaka.click();
        goBasket.click();
        MobileElement deleteItem= driver.findElement(By.id("com.getir.casestudy.dev:id/btnRemove"));
        deleteItem.click();
        System.out.println("basketText.getText() = " + basketText.getText());


        Thread.sleep(4000);

        driver.closeApp();
        driver.quit();
    }
}
