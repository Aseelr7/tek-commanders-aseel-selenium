package week_2.Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityTwo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        String firstName = "Max";
        String lastName = "Verstappen";
        String email = "Rahmaani@emdawail.com";
        String password = "Rahamani@dw2123";

        driver.get("https://dev.retail.tekschool-students.com/");

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("register here")))
                .click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName")))
                .sendKeys(firstName);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastName")))
                .sendKeys(lastName);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")))
                .sendKeys(email);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")))
                .sendKeys(password);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("confirmPassword")))
                .sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']"))).click();

        wait.until(ExpectedConditions.urlContains("https://dev.retail.tekschool-students.com/auth/signin"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")))
                .sendKeys(email);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")))
                .sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'ant-space-item']/button")))
                .click();

        WebElement text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul//div[@class = 'ant-space-item']")));


        if(text.getText().contains(firstName)&& text.getText().contains(lastName)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        driver.quit();








    }
}
