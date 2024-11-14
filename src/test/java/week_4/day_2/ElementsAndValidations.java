package week_4.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsAndValidations {
    public  WebDriver driver;
    public  WebDriverWait wait;
    public  Actions action;

    public ElementsAndValidations(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        action = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public void navigateToUrl(String url){
        driver.get(url);
        wait.until(ExpectedConditions.urlMatches(url));
    }

    public void clickWithValidation(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        action.click(element).perform();
    }

    public void sendKeysWithValidation(String xpath , String keys){
        WebElement element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element.clear();
        action.click(element).perform();
        action.sendKeys(keys).perform();
    }

    public void textVerification(String xpath, String correctString){
        WebElement element = driver.findElement(By.xpath(xpath));
        if (element.getText().equals(correctString)){
            System.out.println("Test Passed Displayed Info is: " + element.getText());
        }else System.out.println("Test Failed Displayed Info is: " + element.getText());
    }

    public void closeBrowser(){
        driver.quit();
    }
}
