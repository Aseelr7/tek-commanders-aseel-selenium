package week_2.Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityOne {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://dev.retail.tekschool-students.com/");

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")))
                .click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")))
                .sendKeys("quinn.turner@example.com");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")))
                .sendKeys("password123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")))
                .click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'ant-space-item']/button")))
                .click();

      WebElement text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul//div[@class = 'ant-space-item']")));


      if(text.getText().equals("Quinn Turner")){
          System.out.println("Test Passed");
      }else System.out.println("Test Failed");

    }
}
