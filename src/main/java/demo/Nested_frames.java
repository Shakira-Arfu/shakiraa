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


public class Nested_frames {
    ChromeDriver driver;
    public Nested_frames()
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
    public void framehandling() {
      // navigate to URL		https://the-internet.herokuapp.com/nested_frames
      driver.get("https://the-internet.herokuapp.com/nested_frames");
   // firat we need to switch to top frame		switchTo().frame('frame-top')
   driver.switchTo().frame("frame-top");
   // frist we need to switch to left frame		switchTo().frame("frame-left")
   driver.switchTo().frame("frame-left");
   // get text from the  child frame		webElement=leftframe.getText()/
     WebElement leftframe = driver.findElement(By.tagName("body"));
     String leftfaram = leftframe.getText();
     System.out.println(leftfaram);
   // switch to parentframe		switchTo.parentframe()
   driver.switchTo().parentFrame();
   // frist we need to switch to middle frame		switchTo().frame("frame-middle")
   driver.switchTo().frame("frame-middle");
   // get text from the middle child frame		webElement=middleframe.getText()/
   WebElement middleframe =driver.findElement(By.tagName("body"));
   String middlefaram = middleframe.getText();
   System.out.println(middlefaram);
   // switch to parentframe		switchTo.parentframe()
   driver.switchTo().parentFrame();
   // frist we need to switch to right frame		switchTo().frame("frame-right")
   driver.switchTo().frame("frame-right");
   // get text from the right child frame		webElement=rightframe.getText()/
   WebElement rightframe =driver.findElement(By.tagName("body"));
   String rightfaram = rightframe.getText();
   System.out.println(rightfaram);
   //writte a defalte frame
   driver.switchTo().defaultContent();
   //driver.switchTo().parentFrame();
   // frist we need to switch the bottom frame		switchTo().frame("frame-bottom")
   driver.switchTo().frame("frame-bottom");
   //get text from the buttom child frame		webElement=buttomframe.getText()/
   WebElement bottomframe = driver.findElement(By.tagName("body"));
   String bottomfaram = bottomframe.getText();
   System.out.println(bottomfaram);
   driver.switchTo().defaultContent();
   
     
   }
   }