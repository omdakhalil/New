package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

    public static void main(String[] args) {

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("");


    }

}
