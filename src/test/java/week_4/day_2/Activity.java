package week_4.day_2;

public class Activity {


    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://retail.tekschool-students.com/";
        String email = "Josh@email.com";;
        String password = "Aseel@123";
        String newName = "Aseel";
        String newEmail = "aseel@email.com";

        UtilitiesClass ev = new UtilitiesClass();
        ev.navigateToUrl(baseUrl);

        // Clicking on Sign In Button
        ev.clickWithValidation("//a[@id = 'signinLink']");

        //Sending the SignIn info
        ev.sendKeysWithValidation("//input[@id = 'email']",email);
        ev.sendKeysWithValidation("//input[@id = 'password']",password);
        ev.clickWithValidation("//button[@id = 'loginBtn']");

        //Clicking on Account Tab
        ev.clickWithValidation("//a[@id = 'accountLink']");

        //Updating the Info
        ev.sendKeysWithValidation("//input[@id = 'nameInput']",newName);
        ev.sendKeysWithValidation("//input[@id = 'emailInput']",newEmail);
        ev.clickWithValidation("//button[@id = 'personalUpdateBtn']");

        // altering the month
        ev.InteractWithSelectByValue("//select[@name = 'expirationMonth']","12");
        //altering The year
        ev.InteractWithSelectByValue("//select[@name = 'expirationYear']","2026");

        // Verifying The New Info
        ev.textVerification("//h1[@class = 'account__information-username']",newName);
        ev.textVerification("//h1[@class = 'account__information-email']",newEmail);

        ev.closeBrowser();




















    }

}
