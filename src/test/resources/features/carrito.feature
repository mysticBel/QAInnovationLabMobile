@ValidarDemoApp
Feature:  Validar la funcionalidad del carrito de compras de My Demo App - SauceLabs.

  @ValidarCarritoTest
  Scenario Outline: Comprobar el funcionamiento del carrito al añadir productos
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego "<UNIDADES>" del siguiente producto "<PRODUCTO>"
    Then valido que el carrito de compra se actualice correctamente

    Examples:
      | PRODUCTO                   | UNIDADES |
      | Sauce Labs Backpack        | 1        |
      | Sauce Labs Bolt T-Shirt    | 1        |
      | Sauce Labs Bike Light      | 2        |