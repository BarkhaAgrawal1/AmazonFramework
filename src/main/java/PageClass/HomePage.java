package PageClass;

import BasePackage.Baseclass;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Baseclass {


    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
    WebElement signin;

  public HomePage(WebDriver driver){
       this.driver =driver;
      PageFactory.initElements(driver, this);


  }

public LoginPage setSignin(){
      signin.click();
      return new LoginPage(driver);
}

}
