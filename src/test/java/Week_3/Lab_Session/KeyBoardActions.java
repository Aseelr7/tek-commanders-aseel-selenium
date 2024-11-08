package Week_3.Lab_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardActions {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://monday.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'link-item-component-wrapper']/a[text() = 'Log in']"));
        action.click(loginButton).perform();

        WebElement emailAddress = driver.findElement(By.id("user_email"));

        for(char character : "email@example.com".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        WebElement nextButton = driver.findElement(By.xpath("//div[@class = 'next-button-component']"));
        action.click(nextButton).perform();

        driver.quit();

    }
}
