package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ErrorMessagePrint {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id = 'signinLink']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id = 'newAccountBtn']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id = 'signupBtn']")).click();
        List< WebElement > errors = driver.findElements(By.xpath("//*[@class = 'error']"));

        for (WebElement error : errors){
            System.out.println(error.getText());
        }

        driver.quit();
    }
}
