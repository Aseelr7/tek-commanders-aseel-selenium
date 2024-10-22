package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAButton {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLink = By.id("signinLink");

        WebElement signIn = driver.findElement(signInLink);
        signIn.click();
    }
}
