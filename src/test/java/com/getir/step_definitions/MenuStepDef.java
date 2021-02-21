package com.getir.step_definitions;



import com.getir.pages.BasketPage;
import com.getir.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class MenuStepDef {
    BasketPage basketPage = new BasketPage();
    LoginPage loginPage = new LoginPage();


    @Then("The user go to main menu and menu size should be {int}")
    public void theUserGoToMainMenuAndMenuSizeShouldBe(int expectedSize) throws InterruptedException {
        int actualSize = basketPage.menuList.size();
        System.out.println(actualSize);
        Thread.sleep(2000);
        Assert.assertEquals(expectedSize,actualSize);



    }
    @And("The user click on the {string} button")
    public void theUserClickOnTheButton(String menu) throws InterruptedException {
        Thread.sleep(2000);
        basketPage.getMenu(menu);

    }

    @And("The user add more items and navigate the main menu")
    public void theUserAddMoreItemsAndNavigateTheMainMenu() throws InterruptedException {
        loginPage.waitUntil(basketPage.addCikolatali).click();
        basketPage.addCikolatali.click();

        Thread.sleep(2000);
        basketPage.addSaka.click();
        basketPage.addSaka.click();
        basketPage.navigateLeft.click();
        Thread.sleep(1555);
    }

    @And("The user add three items and go to basket")
    public void theUserAddThreeItemsAndGoToBasket() throws InterruptedException {

        loginPage.waitUntil(basketPage.addCikolatali).click();
        basketPage.addCikolatali.click();
        basketPage.addCikolatali.click();
        basketPage.goToBasket.click();
        Thread.sleep(2000);
        System.out.println(basketPage.basketText);


    }
}
