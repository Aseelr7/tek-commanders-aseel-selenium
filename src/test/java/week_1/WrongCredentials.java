package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongCredentials {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signIn = By.id("signinLink");
        WebElement sign = driver.findElement(signIn);
        sign.click();

        By emailFieldLocator = By.name("email");
        WebElement emailFieldElement = driver.findElement(emailFieldLocator);
        emailFieldElement.sendKeys("lkajsdiej@kjsi.com");

        By passwordFieldLocator = By.id("password");
        WebElement passwordFieldElement = driver.findElement(passwordFieldLocator);
        passwordFieldElement.sendKeys("12345678@asdf");

        By loginButtonLocator = By.id("loginBtn");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        Thread.sleep(1000);
        By errorMessageLocator = By.className("error");
        WebElement errorMessageElement = driver.findElement(errorMessageLocator);
        System.out.println(errorMessageElement.getText());
        driver.quit();

    }
}
