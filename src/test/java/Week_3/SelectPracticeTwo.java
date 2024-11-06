package Week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;


public class SelectPracticeTwo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        WebElement dropDown = driver.findElement(By.cssSelector("select#languageSelect"));
        Select dropDownSelect = new Select(dropDown);
        dropDownSelect.selectByIndex(2);
        dropDownSelect.selectByValue("Persian");
        dropDownSelect.selectByVisibleText("English");
        List<WebElement> options = dropDownSelect.getOptions();
        Iterator<WebElement> itr = options.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next().getText());
        }
        driver.quit();

    }
}
