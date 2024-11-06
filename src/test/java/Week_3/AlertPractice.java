package Week_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.findElement(By.cssSelector("button#alertBtn")).click();

        Alert firstAlertButton = driver.switchTo().alert();
        System.out.println( firstAlertButton.getText());
        firstAlertButton.accept();
        driver.quit();

    }
}
