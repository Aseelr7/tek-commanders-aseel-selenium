package week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTheTitle {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

       driver.quit();

    }
}
