package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        Assert.assertTrue(dash.welcomeMsg.isDisplayed());
        //System.out.println("test passed");
        //tearDown();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        LoginPage login=new LoginPage();
        //WebElement usernamefield= driver.findElement(By.id("txtUsername"));
        sendText(login.usernameBox,"admin");
        //WebElement passwordfield= driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox, "Hum@nhrm123");
    }
    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        // leaving it for validation
        //tearDown();
    }
    @When("user enters invlaid username and password")
    public void user_enters_invlaid_username_and_password() {
        LoginPage login=new LoginPage();
        //WebElement usernamefield= driver.findElement(By.id("txtUsername"));
        sendText(login.usernameBox, "admin");
       // WebElement passwordfield= driver.findElement(By.name("txtPassword"));
        sendText(login.passwordBox, "Hum@nhrm123");
    }
    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        //tearDown();
    }
}
