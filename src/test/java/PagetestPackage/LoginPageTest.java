package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.HomePage;
import PageClass.LandingPage;
import PageClass.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static BasePackage.Baseclass.driver;
import static BasePackage.Baseclass.prop;

public class LoginPageTest extends Baseclass {

    HomePage home;
    LoginPage login;
    LandingPage land;

    LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
        home = new HomePage(driver);
        login = new LoginPage(driver);
        login = home.setSignin();
        land = new LandingPage(driver);


    }

    @Test
    public void enterdetails() throws InterruptedException {
        login.enter(prop.getProperty("number"));
        login.word(prop.getProperty("password"));

        land = login.clickbutton();
        Thread.sleep(20);

    }
}



