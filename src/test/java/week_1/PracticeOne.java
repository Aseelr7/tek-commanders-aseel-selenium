package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOne {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By loginLink = By.id("signinLink");
        WebElement signIn = driver.findElement(loginLink);
        signIn.click();

        Thread.sleep(5000);

      //  driver.close();
        driver.quit();

    }
}
