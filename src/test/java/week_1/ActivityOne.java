package week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class ActivityOne {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("For opening the app with chrome press one \n" +
                "for opening app with edge press two: ");
        int userChoice = userInput.nextInt();

        if (userChoice == 1 ){
            WebDriver driver = new ChromeDriver();
            driver.get("https://dev.retail.tekschool-students.com/");
            System.out.println("Chrome Title: " + driver.getTitle());

            driver.quit();
        } else if (userChoice == 2 ){
            WebDriver driver = new EdgeDriver();
            driver.get("https://dev.retail.tekschool-students.com/");
            System.out.println("Edge Title: " + driver.getTitle());
            driver.quit();
        } else System.out.println("Invalid Choice!");




    }
}
