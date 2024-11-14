package week_4.day_1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeOne {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Actions action = new Actions(driver);

        driver.get("https://retail.tekschool-students.com/selenium/inputs");

        WebElement inputField = driver.findElement(By.id("textInput"));
        action.keyDown(Keys.SHIFT);

        action.click(inputField).perform();
        for (char character : "hello".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }
        action.keyUp(Keys.SHIFT);

        action.keyDown(Keys.TAB);

        for (char character : "hello".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        ((JavascriptExecutor) driver).executeScript("window.open('https://retail.tekschool-students.com/selenium/drag-drop','_blank')");

        List<String> windowHandles = new ArrayList<>( driver.getWindowHandles());

        driver.switchTo().window(windowHandles.get(1));

        WebElement firstOne = driver.findElement(By.xpath("//div[normalize-space()='Payment should not accept invalid expiration date']"));
        WebElement secondOne = driver.findElement(By.xpath("//div[contains(@data-rbd-droppable-id,'2')]"));
        action.clickAndHold(firstOne).perform();
        action.moveByOffset(0,10).perform();
        action.moveToElement(secondOne).perform();
        action.release().perform();


        WebElement thirdOne = driver.findElement(By.xpath("//div[@data-rbd-draggable-id = '2']"));

        action.clickAndHold(thirdOne).moveByOffset(10,0).moveToElement(secondOne).release().perform();

        driver.switchTo().window(windowHandles.get(0));

        WebElement rangePicker = driver.findElement(By.id("rangeInput"));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        for (int i = 0 ; i <= 50 ; i++){
            jsExecutor.executeScript("arguments[0].value = "+i+";",rangePicker);
            Thread.sleep(100);
        }

        WebElement datePicker = driver.findElement(By.id("dateInput"));
        LocalDate now = LocalDate.now();
        datePicker.clear();
        String nowTime =  now.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println(nowTime);
        datePicker.sendKeys(nowTime);

    }
}
