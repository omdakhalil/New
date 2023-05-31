package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement malBatn = driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEnabledMale = malBatn.isEnabled();
        System.out.println("the radio button male is enabled "+ isEnabledMale);

        boolean isDisplayedMale = malBatn.isDisplayed();
        System.out.println("the radio button male is enabled "+ isDisplayedMale);
        boolean isSelectedmale =malBatn.isSelected();
        System.out.println("the radio button male is enabled "+ isSelectedmale);
        if (!isSelectedmale){
            malBatn.click();

        }
        isSelectedmale=malBatn.isSelected();
        System.out.println("the radio button male is enabled "+ isSelectedmale);

    }
}
