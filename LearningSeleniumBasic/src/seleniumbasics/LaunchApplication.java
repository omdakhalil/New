package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1- Open the Browser

        System.setProperty("webdriver.chrome.driver","C:\\Users\\emad_\\IdeaProjects\\demo\\LearningSeleniumBasic\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");




    }
}
