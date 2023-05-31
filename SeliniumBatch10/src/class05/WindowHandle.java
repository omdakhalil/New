package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1091041677%3A1678243052052404&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHduboLOqTT5amIQt1Ih-qkpvXLJkTgy4vNcpB9f1IjUnCt5p8YX1xkstMh4AQ4f67mJFoUP");

        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

       String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        // get window handles of all the windows that have been opened up
        Set<String>windowHandles = driver.getWindowHandles();
        // print all the window handles
        for (String wh:windowHandles){
            System.out.println(wh);
            // switch the focus of the driver to help window
            driver.switchTo().window(wh);
            // check the title of the  window to which our focus is right now
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        }
        // to verify we switch to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);

    }


        }










