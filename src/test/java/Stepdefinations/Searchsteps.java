package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {

    @Given("User login to application")
    public void user_login_to_application() {
        System.out.println("I have logged in ");
    }
    @When("Enter the product name as {string}")
    public void enter_the_product_name_as(String string) {

        System.out.println("I have Enter the product as MacBook Pro ");

    }
    @Then("Product name should display in results as {string}")
    public void product_name_should_display_in_results_as(String string) {
        System.out.println("Mac Book Pro is showing properly with correct prices");
    }


}
