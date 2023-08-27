package demo;
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


public class Search_Amazon {
    ChromeDriver driver;
    public Search_Amazon()
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
public void loginAmazon() {
   // navigate to google home page	Using Locator "XPath"	https://www.google.co.in/
   driver.get("https://www.google.co.in/");
    //Enter text in google text box	Using Locator "XPath"	//textarea[@type = 'search'] /sendKeys("Amazon")
    driver.findElement(By.xpath("//textarea[@type = 'search']")).sendKeys("Amazon");
    //click on the google search button	Using Locator "XPath"	//input[@value = 'Google Search']
     driver.findElement(By.xpath("//input[@value = 'Google Search']")).click();
    
    //valide the Amazon.in is displayed	Using Locator "XPath"	//span[text() = 'Amazon.in']
    boolean result = driver.findElement(By.xpath("//span[text() = 'Amazon.in']")).isDisplayed();
    System.out.println("Amazon present in the result:"+result);
   // valide the Amazon.com is displayed	Using Locator "XPath"	//span[text() = 'Amazon.com']
     
}
}
