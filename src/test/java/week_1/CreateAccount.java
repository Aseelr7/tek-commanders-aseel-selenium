package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        System.out.println(driver.getTitle());

        By signIn = By.id("signinLink");
        WebElement sign = driver.findElement(signIn);
        sign.click();

        By createAccount = By.id("newAccountBtn");
        WebElement createNewAccount = driver.findElement(createAccount);
        createNewAccount.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
