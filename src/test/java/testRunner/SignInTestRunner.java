package testRunner;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SignIn;
import setup.Setup;

public class SignInTestRunner extends Setup {
    SignIn signIn;
    @BeforeTest
    public void visitUrl(){
//        Setup setup= new Setup();
//        super.setup();
        signIn= new SignIn(driver,"testuser255@mailto.plus","TestUser1234+");
        driver.get("https://magento.softwaretestingboard.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }
    @Test(priority = 1)
    public void visitLogin(){
        signIn.linkSignIn.click();
        signIn.doLogin();
    }
    @Test(priority = 2,enabled = false)
    public void doLogin(){
        signIn.doLogin();
    }
}
