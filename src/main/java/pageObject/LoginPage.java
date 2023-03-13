package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.saucedemo.com/
public class LoginPage {
    @FindBy(xpath = "//input[@id=\"user-name\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id=\"login-button\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    private WebElement errorMessage;

    public void login(String name, String pass){
        userNameField.sendKeys(name);
        passwordField.sendKeys(pass);
        loginButton.click();
    }

    public String getText(){
        return errorMessage.getText();
    }


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

