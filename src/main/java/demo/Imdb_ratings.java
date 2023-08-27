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


public class Imdb_ratings {
    ChromeDriver driver;
    public Imdb_ratings()
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
public void ratings() {
//     navigative to URL  https://www.imdb.com/chart/top/
driver.get("https://www.imdb.com/chart/top/");
//     sort by IMDB rating Using Locator "XPath" (//h3[@class='ipc-title__text'])[2]
 //Select se = new Select(driver.findElement(By.xpath("//select[@id='sort-by-selector']")));
 //se.selectByVisibleText("IMDB rating");
//     getting the highest rated movie on IMDb Using 
WebElement hightestrated = driver.findElement(By.xpath("(//h3[@class='ipc-title__text'])[2]"));
String HightestRated = hightestrated.getText();
System.out.println(HightestRated);
//    How many movies are included in the table?  //li[@class='ipc-metadata-list-summary-item sc-bca49391-0 eypSaE cli-parent'] /size()
List<WebElement> movies = driver.findElements(By.xpath("//li[@class='ipc-metadata-list-summary-item sc-bca49391-0 eypSaE cli-parent']"));
int  allmovies = movies.size();
System.out.println(allmovies);
//for (int movies : allmovies){
//}
//    selecting the drop down button Using Locator "ID" select se = new select(driver.findElement(By.id("ipc-simple-select__input")));
Select se = new Select(driver.findElement(By.xpath("//select[@id='sort-by-selector']")));
//    select the text  se.relese date
se.selectByVisibleText("Release date");
//    What is the oldest movie on the list of text from movie Using Locator "XPath" (//div[@class='sc-b85248f1-0 bCmTgE cli-children'])[250]/div.grtText()
WebElement oldestmovie = driver.findElement(By.xpath("(//div[@class='sc-b85248f1-0 bCmTgE cli-children'])[250]/div"));
String OldestMovie = oldestmovie.getText();
System.out.println(OldestMovie);
//    What is the most recent movie on the listand text movie name Using Locator "XPath" (//div[@class='sc-b85248f1-0 bCmTgE cli-children'])[1]/div
WebElement recentmovie = driver.findElement(By.xpath("(//div[@class='sc-b85248f1-0 bCmTgE cli-children'])[1]/div"));
String RecentMovie = recentmovie.getText();
System.out.println(RecentMovie);
//    Which movie has the most user ratings Using Locator "XPath" (//h3[@class='ipc-title__text'])[2]
driver.findElement(By.xpath("(//h3[@class='ipc-title__text'])[2]"));
     
     
     
   
        
}
}
