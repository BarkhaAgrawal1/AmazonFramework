package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPagetest extends Baseclass {

    HomePage home;
    LoginPage login;
    LandingPage land;
    SearchPage product1;
    PaymentPage pay;

    SearchPagetest(){
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



    }
    @Test
public void checkouttest(){
       pay= product1.checkout();



}









}
