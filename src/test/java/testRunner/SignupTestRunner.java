package testRunner;

import pages.Signup;
import setup.Setup;

public class SignupTestRunner extends Setup {
    Signup signup;
    public void visitSignup(){
        signup=new Signup(driver);

    }
}
