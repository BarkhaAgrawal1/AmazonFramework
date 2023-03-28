package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static BasePackage.Baseclass.driver;

public class PaymentPageTest extends Baseclass {

    HomePage home;
    LoginPage login;
    LandingPage land;
    SearchPage product1;
    PaymentPage pay;

    PaymentPageTest(){
        super();
    }
    @BeforeMethod
    public void setup() {
        Initialization();
        home = new HomePage(driver);
        login = new LoginPage(driver);
        login = home.setSignin();
        land = new LandingPage(driver);
        login.enter(prop.getProperty("number"));
        login.word(prop.getProperty("password"));
        login.clickbutton();
        product1= new SearchPage(driver);
        product1.checkout();



    }
    @Test
    public void cartcheck(){
        pay.cart();

    }
}
