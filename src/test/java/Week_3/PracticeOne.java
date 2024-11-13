package Week_3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class PracticeOne {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        String baseUrl = "https://retail.tekschool-students.com/selenium";
        driver.get(baseUrl);
        wait.until(ExpectedConditions.urlMatches(baseUrl));

        /*
        1: Locators
        2: Waits
        3: Js Executor and Tabs
        4: Alerts
        5: Select
        6: CheckBoxes
        7: Actions
         */

        //1 2, 4
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text() = 'Javascript Alerts']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertBtn"))).click();
        Alert firstAlertBtn = driver.switchTo().alert();
        System.out.println(firstAlertBtn.getText());
        Thread.sleep(1000);
        firstAlertBtn.accept();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmBtn"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmButton = driver.switchTo().alert();
        System.out.println(confirmButton.getText());
        Thread.sleep(1000);
        confirmButton.dismiss();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptBtn"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert prompt = driver.switchTo().alert();

        for (char character : "Aha Got it".toCharArray()) {
            prompt.sendKeys(String.valueOf(character));
            Thread.sleep(100);
        }

        Thread.sleep(1000);
        prompt.accept();


        //3

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.youtube.com/','_blank')");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com/login/','_blank')");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.instagram.com/','_blank')");

        ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

        for (String window : windowHandles) {
            driver.switchTo().window(window);
            System.out.println(driver.getTitle());
        }

        driver.switchTo().window(windowHandles.get(1));

        // 5

        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        Actions action = new Actions(driver);

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("programmingLanguageSelect")));
        action.click().perform();

        Select programming = new Select(dropdown);
        programming.selectByIndex(1);
        programming.selectByVisibleText("Java");


        List<WebElement> options = programming.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        WebElement java = programming.getFirstSelectedOption();
        java.click();


        driver.quit();

    }
}


