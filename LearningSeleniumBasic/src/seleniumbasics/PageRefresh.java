package seleniumbasics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
