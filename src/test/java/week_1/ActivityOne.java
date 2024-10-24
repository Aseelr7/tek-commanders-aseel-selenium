package week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class ActivityOne {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        WebDriver driver = null;
        System.out.print("For opening the app with chrome press one \n" +
                         "for opening app with edge press two: ");
        int userChoice = userInput.nextInt();

        switch (userChoice){
            case 1 : driver = new ChromeDriver();
            break;
            case 2 : driver = new EdgeDriver();
            break;
            default : throw  new RuntimeException("Invalid Choice!");
        }
        driver.get("https://dev.retail.tekschool-students.com/");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();


    }
}
