package com.getir.step_definitions;

import com.getir.pages.BasketPage;
import com.getir.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.net.MalformedURLException;



public class BasketStepDef {

    LoginPage loginPage = new LoginPage();
    BasketPage basketPage = new BasketPage();


    @Given("The user on the login page and should be able to login")
    public void theUserOnTheLoginPageAndShouldBeAbleToLogin() {
        loginPage.waitUntil(loginPage.username).sendKeys("hello@getir.com");
        loginPage.waitUntil(loginPage.password).sendKeys("hello");
        loginPage.submit.click();

    }

    @Then("The user go to basket and able to see {string} message")
    public void theUserGoToBasketAndAbleToSeeMessage(String expectedMessage) throws InterruptedException {
      //  Thread.sleep(2000);
        loginPage.waitUntil(basketPage.goToBasket).click();
      //  basketPage.goToBasket.click();
        Thread.sleep(1555);
        String actualMessage = basketPage.basketText.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
        basketPage.navigateLeft.click();

    }

    @Then("The user navigate to main menu and click on the {string} button")
    public void theUserNavigateToMainMenuAndClickOnTheButton(String menu) {

        loginPage.getMenu(menu);

    }

    @And("The add two items and go to basket")
    public void theAddTwoItemsAndGoToBasket() throws InterruptedException {
        loginPage.waitUntil(basketPage.addCikolatali).click();
        Thread.sleep(1000);
        basketPage.addSaka.click();
        basketPage.goToBasket.click();
    }
}
