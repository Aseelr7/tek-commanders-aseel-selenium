package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInGoogle {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        By searchLocator = By.name("q");
        WebElement searchElement = driver.findElement(searchLocator);
        searchElement.sendKeys("TekSchool");

        By searchButton = By.name("btnK");
        WebElement searchElmnt = driver.findElement(searchButton);
        searchElmnt.click();

        By firstLink = By.partialLinkText("TEK SCHOOL Mod");
        WebElement firstLinkElement = driver.findElement(firstLink);
        firstLinkElement.click();

        Thread.sleep(10000);
        driver.quit();



    }
}
