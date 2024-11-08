package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ActionsAndJSExecutor {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.instagram.com/");
        ((JavascriptExecutor) driver ).executeScript("window.open('https://mail.google.com/', '_blank')");
        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/','_blank')");
        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/auth/login', '_blank')");
        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/selenium','_blank')");

        List<String> windowHandles = new ArrayList<>( driver.getWindowHandles());

        for (int i = 0 ; i < windowHandles.size(); i++){
           driver.switchTo().window(windowHandles.get(i));
           System.out.println(driver.getTitle());
       }

        driver.switchTo().window(windowHandles.get(2));

        WebElement signIn = driver.findElement(By.id("signinLink"));
        Actions action = new Actions(driver);

        action.click(signIn).perform();
        driver.switchTo().window(windowHandles.get(3));



        WebElement hoverTab = driver.findElement(By.linkText("Hover"));

        action.click(hoverTab).perform();




    }
}
