package BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass {


public static WebDriver driver;
public static Properties prop;


public Baseclass(){

    try {
        prop = new Properties();
        FileInputStream fi = new FileInputStream("C:\\Users\\deepa\\Documents\\Barkha new intellij\\" +
                "VinayAmazonByBarkha\\src\\main\\java\\ConfigPackage\\Config.properties");
        prop.load(fi);

    } catch (FileNotFoundException e){
        e.printStackTrace();
    } catch (IOException e){
        e.printStackTrace();
    }


}
    public void Initialization(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

    }






}
