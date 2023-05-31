package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        // go to google.com
        driver.get("https://google.com");
        // maximize the window
        driver.manage().window().maximize();

        Thread.sleep(2000);
        // full screen
        driver.manage().window().fullscreen();
    }
}
