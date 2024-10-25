package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityTwo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By searchBarLocator = By.className("ant-input");
        WebElement searchBarElement = driver.findElement(searchBarLocator);
        searchBarElement.click();
        searchBarElement.sendKeys("Apple");

        By searchButton = By.className("ant-btn");
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();
        Thread.sleep(500);

        By cardsLocator = By.tagName("h4");
        List<WebElement> cards = driver.findElements(cardsLocator);

        int cardCounter = 0;
        for (WebElement card : cards){
            cardCounter++;
        }

        if (cardCounter == 3 ){
            System.out.println("Test Passed");
            System.out.println("number of cards: " + cardCounter );
        } else System.out.println("Test Failed not 3 cards on the page" + "\n" +
                "number of cards: " + cardCounter);

        driver.quit();

    }

}
