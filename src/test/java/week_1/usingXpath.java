package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingXpath {
    public static void main(String[] args) throws InterruptedException {



    ChromeDriver driver = new ChromeDriver();
    driver.get("https://retail.tekschool-students.com/products");


        By electronics = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img");
        WebElement electronicsElement = driver.findElement(electronics);
        electronicsElement.click();

        Thread.sleep(1000);


        By playStation = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/p[1]");
        WebElement playstationElement = driver.findElement(playStation);
        Thread.sleep(1000);
        playstationElement.click();

        By psTitle = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/h1");
        WebElement psTitleElement = driver.findElement(psTitle);
        String text =  psTitleElement.getText();
        System.out.println(text);



}
}
