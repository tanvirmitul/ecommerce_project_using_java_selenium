package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement linkCreateAnAccount;
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement linkSignup;
     public Signup(WebDriver driver) {
         PageFactory.initElements(driver,this);
     }
     public void visitSignUp(){
         linkSignup.click();
     }

}
