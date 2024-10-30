package week_2.Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongCredentials {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        driver.findElement(By.cssSelector("a.top-nav__btn")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input#email")).sendKeys("wrong@email.net");
        driver.findElement(By.cssSelector("input#password")).sendKeys("wrongPassword");

        driver.findElement(By.cssSelector("button.w-full")).click();


        Thread.sleep(1000);

        System.out.println( driver.findElement(By.cssSelector("div.error")).getText() );

        driver.quit();

    }
}
