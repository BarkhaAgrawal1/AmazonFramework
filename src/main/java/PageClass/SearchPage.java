package PageClass;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Baseclass {

@FindBy(xpath = "<span class=\"a-size-medium a-color-base a-text-normal\">Apple iPhone 14 Pro Max, 256GB, Space Black - Unlocked (Renewed)</span>")
    WebElement phone;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public PaymentPage checkout(){
        phone.click();
        return new PaymentPage(driver);

    }


}
