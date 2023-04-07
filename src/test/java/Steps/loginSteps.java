package Steps;
import Utils.commonMethods;
import Utils.configReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginSteps extends commonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
       openBrowserAndLaunchApplication();

    }
    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(usernameTextBox, configReader.getPropertyValue("username"));
        sendText(passwordTextBox,configReader.getPropertyValue("password"));


    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        doClick(loginBtn);

    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
//     assertion that u are logged in
        System.out.println("looged in");
    }




    @When("user enters a username {string} and password {string}")
    public void user_enters_a_username_and_password(String username, String password) {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(usernameTextBox,username);
        sendText(passwordTextBox,password);
    }
    @Then("the user is not logged in")
    public void the_user_is_not_logged_in() {
        System.out.println("the user is not logged in");
    }
}
