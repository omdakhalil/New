package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Hamdaa {
    static WebDriver driver;

    public static void main(String[] args) {


    }

 //   @Test
    public void verifyHomePageTitle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.next.us/en");
        Thread.sleep(2000);
        List<WebElement> elements= driver.findElements(By.xpath("//div[7]/div[2]/div/div/a/div[2]"));
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//div[7]/div[2]/div/div["+(i+1)+"]/a/div[2]"));
            element.click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
        }

    }

    public static boolean click(By by) {
        WebElement element;
    //    try {
            element = driver.findElement(by);
     //   } catch (NoSuchElementException e) {
            //e.printStackTrace();
            return false;
        }
  //      element.click();
  //      return true;
//    }

    public void testCase2(){
   //     Assert.assertTrue(click(By.xpath("//input[text()='test']")));
        click(By.xpath(""));
    }
}
