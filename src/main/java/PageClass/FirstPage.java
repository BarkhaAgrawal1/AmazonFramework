package PageClass;

import BasePackage.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends Baseclass {

    @FindBy(linkText = "Books")
    WebElement Books;

    @FindBy(xpath = "//div[@class='left_nav browseBox']")
    WebElement PopularBooks;

    @FindBy(css = ".nav-a-content")
    WebElement childernsBook;

    @FindBy(xpath = "//div[@class='a-section octopus-pc-category-card-v2-title']")
    WebElement catetory;

    @FindBy(linkText = "Baby-2 Years Old")
    WebElement selectbook;

    public FirstPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void firstpage(){
        Books.click();

    }
public HomePage setChildernsBook(){
        childernsBook.click();
        return new HomePage(driver);
}




}

