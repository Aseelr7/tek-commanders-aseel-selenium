package week_4.Lab_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonActivity {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        String baseUrl = "https://www.amazon.com/";

        driver.get(baseUrl);

        // element for Hello Sign IN...
        WebElement hello = driver.findElement(By.xpath("//div[@class = 'nav-line-1-container']"))
        action.moveToElement(hello);

    }
}
