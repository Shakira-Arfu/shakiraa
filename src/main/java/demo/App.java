/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.net.MalformedURLException;

public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // TestCases tests = new TestCases(); // Initialize your test class
        // Search_Amazon search=new Search_Amazon();
        // BookMyShow bms = new BookMyShow();
         Automate_image_urls aiu = new Automate_image_urls();
        // Nested_frames frames = new Nested_frames();
        // Window_handles wh = new Window_handles();
        //Linkedin_image li = new Linkedin_image();
        //Imdb_ratings ir = new Imdb_ratings();
        // TODO: call your test case functions one after other here

        // tests.testCase01();
        // search.loginAmazon();
        // bms.hyperlinks();
         aiu.imgurl();
        // frames.framehandling();
        // wh.handle();
        //li.postimage();
        //ir.ratings();

        // END Tests

        // tests.endTest(); // End your test by clearning connections and closing
        // browser
        // search.endTest();
        // bms.endTest();
          aiu.endTest();
        // frames.endTest();
        // wh.endTest();
       // li.endTest();
      // ir.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
