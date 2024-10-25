package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityThree {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        By signInButtonLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInButtonLocator);
        signInElement.click();

        Thread.sleep(1000);

        By emailField = By.id("email");
        WebElement emailElement = driver.findElement(emailField);
        emailElement.sendKeys("wrong@email.com");

        By passwordField = By.id("password");
        WebElement passElement = driver.findElement(passwordField);
        passElement.sendKeys("passwordWrong");

        By loginButtonPG2 = By.xpath("/html/body/main/div/div/div[2]/div/div[2]/form/div[3]/div/div/div/div/div/button[1]");
        WebElement loginTwo = driver.findElement(loginButtonPG2);
        loginTwo.click();

        Thread.sleep(500);
        By alertMsg = By.className("ant-alert-message");
        WebElement alertElement = driver.findElement(alertMsg);
        String alert = alertElement.getText();
        System.out.println(alert);

        driver.quit();

    }
}
