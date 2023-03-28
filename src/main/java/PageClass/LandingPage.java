package PageClass;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends Baseclass {

@FindBy(xpath = "//input[@type='text']")
    WebElement searchbox;

@FindBy(xpath = "//input[@id='nav-search-submit-button']")
WebElement clicksearch;



    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public SearchPage setSearchbox(String product) {
        searchbox.click();
        searchbox.sendKeys("product");
        clicksearch.click();
         return new SearchPage(driver);

    }
}
