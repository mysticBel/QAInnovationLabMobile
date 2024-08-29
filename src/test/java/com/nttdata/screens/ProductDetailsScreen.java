package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsScreen extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnPlus;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddToCart;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement carritoIcon;

    public void selectProduct(String productName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        WebElement productElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='" + productName + "']")));
        productElement.click();
    }

    public void setUnitsProduct(String unidades) {
        for (int i = 1; i < Integer.parseInt(unidades); i++) {
            btnPlus.click();
        }
    }

    public void addToCarrito() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.saucelabs.mydemoapp.android:id/cartBt"))); // TODO: Revisar este cast
        addToCartButton.click();
    }

    public void validateUnitsOnCarritoIcon() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(carritoIcon));
        int cantidadEnCarrito = Integer.parseInt(carritoIcon.getText());
        Assert.assertTrue("El carrito no se actualizó", cantidadEnCarrito > 0);
    }

    public void openCarrito() {
        carritoIcon.click();
    }
}
