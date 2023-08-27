package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_image_urls {
    ChromeDriver driver;
    public Automate_image_urls ()
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

public void imgurl() {  
   
    // navigate to URL		https://in.bookmyshow.com/explore/home/chennai
    driver.get("https://in.bookmyshow.com/explore/home/chennai");
    // Find the image URLs for all the “Recommended Movies”	Using Locator "XPath"	//div/div/div[1]/div/div/div/div[2]/div/div/div/a/div/div[2]/div/img
   List<WebElement> RecommendeMoviesurl = driver.findElements(By.xpath("//div[@class='style__WidgetContainerBody-sc-lnhrs7-4 YeNog']//a"));
    // Print the all Urls		list.getAttribute
    int printcount = RecommendeMoviesurl.size();
    System.out.println(printcount);
    Actions as=new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //WebElement move=driver.findElement(By.xpath("//*[@id='super-container']/div[2]/div[3]/div[1]/div[6]/div"));
    WebElement scroll = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 iHsoLV'])[2]"));
    js.executeScript("arguments[0].scrollIntoView();", scroll);
     as.moveToElement(scroll).perform();
     scroll.getText();
     System.out.println(scroll);
    // Enter the name of 2nd item in "premiere" list	Using Locator "XPath"	(//div[@class='sc-7o7nez-0 iHsoLV'])[2]
   // WebElement moviename = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 iHsoLV'])[2]"));
    //String Name = moviename.getText();
    //System.out.println(Name);
    // Enter the language of2 nd item in the "premiere"list	Using Locator "XPath"	(//div[@class='sc-7o7nez-0 kHxEsI'])[2]
     WebElement language = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 kHxEsI'])[2]"));
     String movielanguage = language.getText();
     System.out.println( movielanguage);
    // print the name and language in list		list.getAttribute
   // JavascriptExecutor js = (JavascriptExecutor) driver;

   // WebElement scroll =
            //driver.findElement(By.xpath("/div[@class='sc-7o7nez-0 iHsoLV'])[2]);

    //Executing scroll command     
    //js.executeScript("arguments[0].scrollIntoView();", scroll);

    //To hover mover over the webelement
   // actions.moveToElement(scroll).perform();
} 
}
    

