package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.ProductDetailsScreen;
import com.nttdata.screens.ProductsScreen;

public class CarritoSteps {

    ProductsScreen productsScreen;
    ProductDetailsScreen productDetailsScreen;
    CarritoScreen carritoScreen;
    public void validateOpenAppSauceLabs() {
        productsScreen.validateOpenAppSauceLabs();
    }

    public void validateProductsLoaded() {
        productsScreen.validateProductsLoaded();
    }

    public void selectProduct(String productName) {
        productDetailsScreen.selectProduct(productName);
    }

    public void setUnitsProduct(String units) {
        productDetailsScreen.setUnitsProduct(units);
    }

    public void addToCarrito() {
        productDetailsScreen.addToCarrito();
    }

    public void validateUnitsOnCarritoIcon() {
        productDetailsScreen.validateUnitsOnCarritoIcon();
    }

    public void openCarrito() {
        productDetailsScreen.openCarrito();
    }

    public void validateUnitsOnCarrito() {
        carritoScreen.validateUnitsOnCarrito();
    }
}
