package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

       WebElement searchBar = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/input"));
       searchBar.click();
       searchBar.sendKeys("TV");

       WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[1]/div[1]/div[2]/div/button"));
       searchButton.click();

       Thread.sleep(1000);

        WebElement firstTv = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/p[1]"));
        firstTv.click();

        Thread.sleep(1000);

        WebElement tvPage = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/h1"));
        System.out.println(tvPage.getText());

        driver.quit();


    }
}
