package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.saucedemo.com/
public class CheckoutPage {
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCodeField;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;
    @FindBy(xpath = "//h2[@class=\"complete-header\"]")
    private WebElement message;


    public void submitForm(String name, String lastName, String zipCode){
        firstNameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(zipCode);
        continueButton.click();
        finishButton.click();
    }

    public String getSucMess(){
        return message.getText();
    }




    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

