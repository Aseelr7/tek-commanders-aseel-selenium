package week_2.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateProfileWithWait {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));


        driver.findElement(By.xpath("//a[@id = 'signinLink']")).click();
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("aseel@email.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Aseel@123");

        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
        signIn.click();

        driver.findElement(By.cssSelector("a#accountLink")).click();

        //  driver.findElements(By.xpath("//div[@class = 'account__personal-grid']//input")).clear();


        driver.findElement(By.cssSelector("input#personalPhoneInput")).clear();
        driver.findElement(By.cssSelector("input#personalPhoneInput")).sendKeys("5133288897");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#personalUpdateBtn"))).click();
      WebElement toastify =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role = 'alert']/div[2]")));
        System.out.println(toastify.getText());

        driver.quit();


    }
}
