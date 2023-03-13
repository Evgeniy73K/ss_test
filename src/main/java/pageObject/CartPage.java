package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.saucedemo.com/
public class CartPage {
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public void goToCheckoutPage(){
        checkoutButton.click();
    }




    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

