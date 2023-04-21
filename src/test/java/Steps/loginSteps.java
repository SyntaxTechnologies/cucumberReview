package Steps;
import Utils.commonMethods;
import Utils.configReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginSteps extends commonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
       openBrowserAndLaunchApplication();

    }
    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
        sendText(login.usernameTextBox,"Admin");
        sendText(login.passwordTextBox,"Hum@nhrm123");

    }
    @When("clicks on Login Button")
    public void clicks_on_login_button() throws InterruptedException {
        Thread.sleep(5000);
       doClick(login.loginBtn);
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
//can i get the toitle of the page i am on i.e dashboard
//        and verify that i am actually on dashbaord page

//        can i get the welcome message
//        and compare if it is Welcome admin

        String actualMsg = dash.welcomeText.getText();
        String expMsg= "Welcome Admin";
        Assert.assertEquals(expMsg,actualMsg);
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


    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
      sendText(login.usernameTextBox,username);
      sendText(login.passwordTextBox,password);
    }
    @Then("user see a message {string}")
    public void user_see_a_message(String expectedErrorMsg) throws InterruptedException {
        Thread.sleep(4000);
               String actualError= login.errorLogin.getText();
        System.out.println("this is what i am geeting from the website "+actualError);
        System.out.println("this is what i am geeting from the scneario "+expectedErrorMsg);
               Assert.assertEquals(expectedErrorMsg,actualError);

    }
}
