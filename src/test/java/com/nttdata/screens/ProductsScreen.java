package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsScreen extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/mTvTitle")
    private WebElement tvTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productRV")
    private WebElement productRV;

    public void validateOpenAppSauceLabs() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement title = wait.until(ExpectedConditions.visibilityOf(tvTitle));
        Assert.assertTrue("La aplicación no cargo correctamente", title.isDisplayed());
    }

    public void validateProductsLoaded() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(productRV));
    }
}
