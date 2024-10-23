package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLinkText {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By businessTabLocator = By.linkText("Business");
        WebElement businessTabElement = driver.findElement(businessTabLocator);
        businessTabElement.click();

        By titleLocator = By.className("juQBdA");
        WebElement titleElement = driver.findElement(titleLocator);
        System.out.println(titleElement.getText());


    }
}
