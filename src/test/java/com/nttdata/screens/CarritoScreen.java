package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarritoScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private WebElement imgProduct;

    public void validateUnitsOnCarrito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement img = wait.until(ExpectedConditions.visibilityOf(imgProduct));
        Assert.assertTrue("El producto no está en el carrito", img.isDisplayed());
    }
}