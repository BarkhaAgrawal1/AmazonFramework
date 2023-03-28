package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.HomePage;
import PageClass.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Baseclass {


    HomePage home;
    LoginPage login;


     HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
         Initialization();
     home = new HomePage(driver);
     login = new LoginPage(driver);

    }
@Test
    public void setsigntest(){
login=home.setSignin();

}

}
