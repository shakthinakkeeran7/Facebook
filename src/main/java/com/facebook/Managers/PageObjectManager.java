package com.facebook.Managers;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	

	public ProductListingPage getProductListingPage() {

		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;

	}

	

	public CartPage getCartPage() {

		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

	}

	

	public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}
}