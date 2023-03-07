package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithExamples {

    @Given("Navigate to Amazon Videos {string}")
    public void navigate_to_amazon_videos(String string) {
        System.out.println("Navigate to URL");
    }
    @When("Enter the username in {string} field")
    public void enter_the_username_in_field(String string) {
        System.out.println("Enter the Username");
    }
    @When("Enter the password in {string} field")
    public void enter_the_password_in_field(String string) {
        System.out.println("Enter the password");
    }
    @When("click on Login buttn")
    public void click_on_login_buttn() {
        System.out.println("Cliked on Logn Button");
    }
    @Then("user naviagtes to Home page")
    public void user_naviagtes_to_home_page() {
        System.out.println("Logged in succesfully");
    }

}
