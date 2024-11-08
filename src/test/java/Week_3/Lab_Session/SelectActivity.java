package Week_3.Lab_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Struct;
import java.time.Duration;
import java.util.List;

public class SelectActivity {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        String baseUrl = "https://retail.tekschool-students.com/selenium/dropdown";
        driver.get(baseUrl);

        WebElement languages = driver.findElement(By.id("programmingLanguageSelect"));
        Select dropdown = new Select(languages);

       List<WebElement> options =  dropdown.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText());
        }

        dropdown.selectByValue("java");
      WebElement javaOption = dropdown.getFirstSelectedOption();

        System.out.println(javaOption.getText());

        driver.quit();



    }
}
