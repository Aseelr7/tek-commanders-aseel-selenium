package week_4.day_2;

public class Activity {


    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://retail.tekschool-students.com/";
        String email = "Josh@email.com";;
        String password = "Aseel@123";
        String newName = "Aseel";
        String newEmail = "aseel@email.com";

        ElementsAndValidations ev = new ElementsAndValidations();
        ev.navigateToUrl(baseUrl);

        ev.clickWithValidation("//a[@id = 'signinLink']");
        ev.sendKeysWithValidation("//input[@id = 'email']",email);
        ev.sendKeysWithValidation("//input[@id = 'password']",password);

        ev.clickWithValidation("//button[@id = 'loginBtn']");

        ev.clickWithValidation("//a[@id = 'accountLink']");

        ev.sendKeysWithValidation("//input[@id = 'nameInput']",newName);
        ev.sendKeysWithValidation("//input[@id = 'emailInput']",newEmail);

        ev.clickWithValidation("//button[@id = 'personalUpdateBtn']");

        ev.textVerification("//h1[@class = 'account__information-username']",newName);
        ev.textVerification("//h1[@class = 'account__information-email']",newEmail);

        ev.closeBrowser();




















    }

}
