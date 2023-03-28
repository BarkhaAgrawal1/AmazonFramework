package PageClass;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Baseclass {

    @FindBy(xpath = "//button[@id='a-autoid-18-announce']")
    WebElement tmobile;

    @FindBy(xpath = "//img[@alt='Silver']")
    WebElement color;

    @FindBy(xpath = "//*[@id=\"a-autoid-26-announce\"]/div/div[1]/p")
    WebElement size;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addtocart;


  public PaymentPage (WebDriver driver){
      driver = this.driver;
      PageFactory.initElements(driver,this);
  }

    public OrderPage cart() {
        tmobile.click();
        color.click();
        size.click();
        addtocart.click();
      return  new OrderPage(driver);
    }
}

