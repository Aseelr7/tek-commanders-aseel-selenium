package week_2.day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");


        driver.findElement(By.xpath("//a[@id = 'signinLink']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("aseel@email.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Aseel@123");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        Thread.sleep(5000);


        // fix this!!!
        String initialCartNumber = "0";
        try{
        if (driver.findElement(By.xpath("//div[@id = 'cartBtn']/span")).isDisplayed()) {
            initialCartNumber = driver.findElement(By.xpath("//span[@id = 'cartQuantity']")).getText();
        }
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("KeyBoard");

        driver.findElement(By.xpath("//button[@id = 'searchBtn']")).click();

        Thread.sleep(1000);



        driver.findElement(By.xpath("//p[contains(text(),'NPET')]")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//button[@id = 'addToCartBtn']")).click();
        Thread.sleep(1000);


        String secondCartNumber = driver.findElement(By.xpath("//span[@id = 'cartQuantity']")).getText();

        if (Integer.parseInt(initialCartNumber) < Integer.parseInt(secondCartNumber)) {
            System.out.println("Test Passed");
            System.out.println("items in the card = " + secondCartNumber );
        } else {
            System.out.println("Test Failed");
            System.out.println("items in the card = " + initialCartNumber );

        }
        driver.quit();
    }
}
