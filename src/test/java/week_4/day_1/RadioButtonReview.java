package week_4.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButtonReview {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        String baseUrl = "https://retail.tekschool-students.com/selenium/radio";
        driver.get(baseUrl);
        wait.until(ExpectedConditions.urlMatches(baseUrl));

        List<WebElement> tshirts = driver.findElements(By.xpath("//div[contains(@class,'flex')]/input[@name = 'tshirt']/following-sibling::label"));

        for (WebElement tshirt : tshirts){
            System.out.println(tshirt.getText());
        }

        WebElement radioButton = driver.findElement(By.xpath("//div//input[@id = 'large']"));
        radioButton.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
