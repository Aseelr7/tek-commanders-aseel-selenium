package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name = 'username']"));

        action.click(phoneNumber).perform();
        Thread.sleep(200);

        for (char number : "4443332211".toCharArray()){
            action.sendKeys(String.valueOf(number)).perform();
            Thread.sleep(100);
        }








    }
}
