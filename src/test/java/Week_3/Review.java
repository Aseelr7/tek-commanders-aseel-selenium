package Week_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Review {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://tekschool.us/");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank')");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank')");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('https://amazon.com','_blank')");

        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(1000);
        for (int i = 0 ; i < windowHandles.size(); i++){
            driver.switchTo().window(windowHandles.get(i));
            System.out.println(driver.getTitle());
            Thread.sleep(1000);
        }
        driver.quit();
    }
}
