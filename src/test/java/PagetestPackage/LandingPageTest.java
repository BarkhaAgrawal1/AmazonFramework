package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.HomePage;
import PageClass.LandingPage;
import PageClass.LoginPage;
import PageClass.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends Baseclass {
    HomePage home;
    LoginPage login;
    LandingPage land;
     SearchPage product1;

    LandingPageTest() {
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

    }

@Test
    public void searchboxtest() throws InterruptedException {
        product1 = new SearchPage(driver);
        Thread.sleep(1000);
        land.setSearchbox(prop.getProperty("product"));

}
    }
