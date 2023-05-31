package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://wwww.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("omdaaa");

        driver.findElement(By.name("pass")).sendKeys("Omdakakakak");

        driver.findElement(By.linkText("Create new account")).click();

        driver.quit();




    }
}
