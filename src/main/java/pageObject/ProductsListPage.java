package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.saucedemo.com/
public class ProductsListPage {
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"][1]")
    private WebElement firstButtonAttToCart;

    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    private WebElement cartPageLink;

    public ProductsListPage addFirstProduct(){
        firstButtonAttToCart.click();
        return this;
    }

    public void goToCartPage(){
        cartPageLink.click();
    }




    public ProductsListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

