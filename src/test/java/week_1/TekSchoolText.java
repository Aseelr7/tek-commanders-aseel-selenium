package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekSchoolText {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By logoLocator = By.className("top-nav__logo");
        WebElement logoElement = driver.findElement(logoLocator);

        System.out.println(logoElement.getText());
        driver.quit();
    }
}
