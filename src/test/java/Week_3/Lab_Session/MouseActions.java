package Week_3.Lab_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");

        WebElement amazonLogo = driver.findElement(By.xpath("//*[@id=\"nav-bb-logo\"]"));
        action.click(amazonLogo).perform();

        WebElement primeButton = driver.findElement(By.id("nav-link-amazonprime"));
        action.moveToElement(primeButton).perform();

        WebElement medicalCare = driver.findElement(By.xpath("//a[@id='nav_link_allhealthingress']"));
        action.contextClick(medicalCare).perform();
        action.click(medicalCare).perform();

        WebElement PayPerVisit = driver.findElement(By.xpath("//*[@id='nav-link-pay-per-visit-landing-desktop']/pui-text/div"));
        action.click(PayPerVisit).perform();


    }
}
