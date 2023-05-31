package class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass {
    public static void main(String[] args) {
        //     tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com

        //   goto syntax HRMS application and login and goto the pim option

        //  go to the website
        driver.get("http://www.amazon.com");





    }
}
