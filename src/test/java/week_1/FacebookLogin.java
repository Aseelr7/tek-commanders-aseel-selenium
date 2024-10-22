package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);

        emailElement.sendKeys("Aseel@yahoo.com");

        By passwordLocator = By.name("pass");
        WebElement passwordElement = driver.findElement(passwordLocator);

        passwordElement.sendKeys("7788aseel@");

    }
}
