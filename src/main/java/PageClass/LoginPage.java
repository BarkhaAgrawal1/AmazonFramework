package PageClass;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {


    @FindBy(xpath = "//input[@type='email']")
    WebElement Number;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement cont;

    @FindBy(xpath = "//input[@type='password']")
    WebElement pass;

    @FindBy(xpath = "//input[@id ='signInSubmit']")
    WebElement button;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public  void enter(String number){
        Number.sendKeys(prop.getProperty("number"));
cont.click();

    }

    public void word(String password){
        pass.sendKeys(prop.getProperty("password"));


    }

    public LandingPage clickbutton(){
        button.click();
        return new LandingPage(driver);
    }
}
