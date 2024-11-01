package week_2.day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathActivity {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement searchBar = driver.findElement(By.xpath("//input[@id = 'searchInput']"));
        searchBar.sendKeys("KeyBoard");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id = 'searchBtn' ]"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement firstKeyboard = driver.findElement(By.xpath("//div[@class = 'products']/div[1]"));
        firstKeyboard.click();

        Thread.sleep(1000);

        WebElement KeyPage = driver.findElement(By.xpath("//h1[@class = 'product__name']"));
        System.out.println(KeyPage.getText());

        driver.quit();


    }
}
