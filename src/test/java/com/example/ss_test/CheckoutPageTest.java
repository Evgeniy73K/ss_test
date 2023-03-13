package com.example.ss_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CartPage;
import pageObject.CheckoutPage;
import pageObject.ProductsListPage;

public class CheckoutPageTest extends BaseTest{
    private CartPage cartPage;
    private ProductsListPage productsListPage;
    private CheckoutPage checkoutPage;


    @Test
    public void validBuyTest(){
        cartPage = new CartPage(driver);
        productsListPage = new ProductsListPage(driver);
        checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        productsListPage.addFirstProduct()
                .goToCartPage();
        cartPage.goToCheckoutPage();
        checkoutPage.submitForm("test","test", "test");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html")
                &&checkoutPage.getSucMess().equals("Thank you for your order!"),"Url or message not valid");

    }

}
