package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingXpath {
    public static void main(String[] args) {



    ChromeDriver driver = new ChromeDriver();
    driver.get("https://retail.tekschool-students.com/products");


        By electronics = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div/div[2]/img");
        WebElement electronicsElement = driver.findElement(electronics);
        electronicsElement.click();


        By playStation = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/p[1]");
        WebElement playstationElement = driver.findElement(playStation);

        String text =  playstationElement.getText();
        System.out.println(text);

}
}
