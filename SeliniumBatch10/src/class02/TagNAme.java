package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNAme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://wwww.amazon.com/");

        driver.findElements(By.tagName("a"));



    }
}
