package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class BookMyShow {
    ChromeDriver driver;
    public BookMyShow()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
public void hyperlinks() {
    //navigative URL		https://in.bookmyshow.com/explore/home/chennai
    driver.get("https://in.bookmyshow.com/explore/home/chennai");

//list all the hyperlink in the book my show web page  	Using Locator "Tag Name"	<a>
List<WebElement>List =  driver.findElements(By.tagName("a"));
//print the all count of hyperlink		list.size()
                    int a=List.size();
                    System.out.println("a");
}
}
