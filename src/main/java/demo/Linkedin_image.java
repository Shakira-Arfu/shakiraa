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

public class Linkedin_image {

    ChromeDriver driver;

    public Linkedin_image() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void postimage() throws InterruptedException {
// navigate to URL		https://www.linkedin.com/feed/
driver.get("https://www.linkedin.com/feed/");
Thread.sleep(3000);
// Enter valid the email text box	Using Locator "XPath"	//input[@type='text']
driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("1234567890");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admain@1234");
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admain8523@gmail.com");
// chek the email is displayed	Using Locator "ID"	session_key
// Enter the valid the password in text box	Using Locator "XPath"	//input[@type='password']
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admain@1234");
// check the password is displayed	Using Locator "ID"	session_password
// Sign In to your LinkedIn account.	Using Locator "XPath"	//button[contains(@class,'btn-md btn-primary')] click()
 driver.findElement(By.xpath("//button[text()='Sign in']")).click();;
 Thread.sleep(3000);

// click on the sig in button is successfull	Using Locator "ID"	//li-icon[@type='app-linkedin-bug-color-icon']
// driver.findElement(By.xpath("//li-icon[@type='app-linkedin-bug-color-icon']"));
// Thread.sleep(3000);
// start witha a post in linkedin	Using Locator "XPath"	//button[@id='ember35'].click()
driver.findElement(By.xpath("//button[@id='ember42']")).click();
//Thread.sleep(3000);
// select a image button	Using Locator "XPath"	//span[@id='ember355']/button 
driver.findElement(By.xpath("(//span[@class='share-promoted-detour-button__icon-container'])[1]")).click();
//Thread.sleep(3000);
WebElement fileInput = driver.findElement(By.xpath("//input[@id='image-sharing-detour-container__file-input']"));
//     Send the Path of the File to the Element:		fileInput.sendKeys("path/to/your/photo.jpg");
//C:\Users\Sk.Siraj\Pictures\sports fashionreset.jpg.g
fileInput.sendKeys("C:\\Users\\Sk.Siraj\\Pictures\\Screenshots\\Screenshot (592).png");
Thread.sleep(3000);
// submit the form		
// click on the done button	Using Locator "XPath"	//button[contains(@class,'share-box-footer__primary-btn artdeco-button')]
driver.findElement(By.xpath("//button[contains(@class,'share-box-footer__primary-btn artdeco-button')]")).click();		
    
}
}
       
        