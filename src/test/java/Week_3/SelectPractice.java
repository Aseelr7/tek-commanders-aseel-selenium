package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectPractice {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        WebElement dropDown = driver.findElement(By.id("programmingLanguageSelect"));

        Select languageDropdown = new Select(dropDown);

        languageDropdown.selectByIndex(2);
        languageDropdown.selectByValue("php");
        languageDropdown.selectByVisibleText("Golang");

        List<WebElement> options = languageDropdown.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText());
        }


    }
}
