package week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActivityOne {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://dev.retail.tekschool-students.com/");
        System.out.println("Chrome Title: " + chromeDriver.getTitle());

        chromeDriver.quit();

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        System.out.println("Edge Title: " + edgeDriver.getTitle());
        edgeDriver.quit();
    }
}
