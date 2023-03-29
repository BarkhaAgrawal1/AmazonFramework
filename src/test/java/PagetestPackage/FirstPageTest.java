package PagetestPackage;

import BasePackage.Baseclass;
import PageClass.FirstPage;
import PageClass.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstPageTest extends Baseclass {
    FirstPage first;
    HomePage home;

    public FirstPageTest(){
        super();
    }
    @BeforeMethod
    public void books(){
        Initialization();
     first = new FirstPage(driver);
        home = new HomePage(driver);

        }
@Test
    public void firstpage() throws InterruptedException {
        first.firstpage();
     home=   first.setChildernsBook();

    }


}







