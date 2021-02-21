package com.getir.step_definitions;

import com.getir.Utilities.ScrollHelper;
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
        Thread.sleep(1000);
        basketPage.navigateLeft.click();


    }

    @Then("The user navigate to main menu and click on the {string} button")
    public void theUserNavigateToMainMenuAndClickOnTheButton(String menu) throws InterruptedException {

        Thread.sleep(1555);
        loginPage.getMenu(menu);

    }

    @And("The add two items and go to basket")
    public void theAddTwoItemsAndGoToBasket() throws InterruptedException {
        loginPage.waitUntil(basketPage.addCikolatali).click();
        basketPage.addSaka.click();
        Thread.sleep(1333);

        basketPage.navigateLeft.click();
       // loginPage.waitUntil(basketPage.navigateLeft).click();

    }

    @And("The user add one item and go to basket and delete all items")
    public void theUserAddOneItemAndGoToBasketAndDeleteAllItems() {
        new ScrollHelper().scrollVerticalHelper("Ürün 38");

        loginPage.waitUntil(basketPage.addDraje).click();
        basketPage.goToBasket.click();

    }

    @And("The user should be able to see {string} message")
    public void theUserShouldBeAbleToSeeMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(2000);
        basketPage.deleteSaka.click();
        basketPage.deleteDraje.click();
        basketPage.deleteÜlker.click();
        String actualMessage = basketPage.basketText.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
