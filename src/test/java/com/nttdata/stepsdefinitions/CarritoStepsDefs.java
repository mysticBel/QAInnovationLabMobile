package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CarritoStepsDefs {
    @Steps
    CarritoSteps carrito;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        carrito.validateOpenAppSauceLabs();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carrito.validateProductsLoaded();
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String units, String productName) {
        carrito.selectProduct(productName);
        carrito.setUnitsProduct(units);
        carrito.addToCarrito();
    }

    @Then("valido que el carrito de compra se actualice correctamente")
    public void validoQueElCarritoDeCompraSeActualiceCorrectamente() {
        carrito.validateUnitsOnCarritoIcon();
        carrito.openCarrito();
        carrito.validateUnitsOnCarrito();
    }
}
