package week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginConfirmation {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");


        driver.findElement(By.xpath("//a[@id = 'signinLink']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("aseel@email.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Aseel@123");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type = 'submit']")).click();


        Thread.sleep(1000);
        boolean isLogoutDisplayed = driver.findElement(By.xpath("//button[@class = 'top-nav__btn']")).isDisplayed();

        if (isLogoutDisplayed){
            System.out.println("Successfully Logged in");
        } else System.out.println("Not Logged in");

        driver.quit();


    }
}
