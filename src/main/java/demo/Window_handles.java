package demo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.chrome.ChromeDriver;
    import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
    //Selenium Imports
    import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
    import org.openqa.selenium.remote.BrowserType;
    import org.openqa.selenium.remote.DesiredCapabilities;
    import org.openqa.selenium.remote.RemoteWebDriver;
    import org.openqa.selenium.support.ui.Select;
    ///
    
    
    public class Window_handles {
        ChromeDriver driver;
        public Window_handles()
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
public void handle() {
    // navigate to URL		https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open
    driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
    // writte the parent window handle		string windowHandle = driver.getwindowHandle
    String parentWindowHandle = driver.getWindowHandle();
     System.out.println("parent window handle:"+parentWindowHandle);
      driver.switchTo().frame("iframeResult");
      WebElement iframeResult = driver.findElement(By.tagName("body"));
      String frames = iframeResult.getText();
      System.out.println(frames);
    //  Click on the  "Try it" button at the top of the page	Using Locator "XPath"	//button[@onclick='myFunction()'].click()
         driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();   
    // make a set of all windows handling Set<Strings>windowHandles		driver.getwindowHandles
    Set<String> windowHandles = driver.getWindowHandles();
    // switch to another window		driver.switchTo().window(windowhandles)
    
    // get the current URL	
   // driver.getCurrentUrl();	
    // get the window title		//h1[@class='learntocodeh1'].getTitle()
    // take the screenshort of the window		driver.getScreenshortAs(output type:window)

    for(String windowHandle:windowHandles){
        if (!windowHandle.equals(parentWindowHandle)){
            driver.switchTo().window(windowHandle); 
           File sourcefile = driver.getScreenshotAs(OutputType.FILE);
           String timeStamp = new  SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
           File duplicatefile=new File("Screenshot " + timeStamp + ".png");
           try {
             FileUtils.copyFile(sourcefile,duplicatefile);
         } catch (IOException e) {
             System.out.println("ScreenShot is not recognize");
             e.printStackTrace();
         }
           //String timestamp=new SimpleDateFormat() 
        }
        
        System.out.println(windowHandle);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
    // close the window		driver.close()
     driver.close();
    // // switch to the parentwindow		driver.switchTo().window(parentwindowHandle) 
     driver.switchTo().window(parentWindowHandle) ;
 }
 }
      