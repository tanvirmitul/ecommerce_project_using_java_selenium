package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn2 {
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public SignIn2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void setUsernameField(String email){
        usernameField.sendKeys(email);
    }
    public WebElement getUsernameField(){
        return usernameField;
    }
}
