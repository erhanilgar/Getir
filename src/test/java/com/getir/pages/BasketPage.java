package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton")
    public AndroidElement goToBasket;

    @FindBy(id = "com.getir.casestudy.dev:id/tvTitle")
    public AndroidElement basketText;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")
    public AndroidElement navigateLeft;

    @AndroidFindBy(id = "com.getir.casestudy.dev:id/btnAdd")
    public AndroidElement addCikolatali;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
    public AndroidElement addSaka;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
    public AndroidElement addDraje;



}
