package week_4.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxesPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);


        String baseUrl = "https://retail.tekschool-students.com/selenium/checkbox";
        driver.get(baseUrl);
        wait.until(ExpectedConditions.urlMatches(baseUrl));

        List<WebElement> interestsLabels = driver.findElements(By.xpath("//fieldset/div/input/following-sibling::label"));

        for (WebElement label : interestsLabels){
            System.out.println(label.getText());
        }

        List<WebElement> interestsCheckBoxes = driver.findElements(By.xpath("//fieldset/div/input"));

        for (WebElement interest : interestsCheckBoxes){
            action.click(interest).perform();
            Thread.sleep(100);
        }

        System.out.println("Total number of checkboxes in field: " + interestsCheckBoxes.size());

    }
}
