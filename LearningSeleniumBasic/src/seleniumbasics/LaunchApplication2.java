package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchApplication2 {
    public static void main(String[] args) {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

      //  WebDriver driver=new ChromeDriver();
          driver.get("https://www.google.com/");
       // driver.navigate().to("https://www.google.com/");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);




    }
}
