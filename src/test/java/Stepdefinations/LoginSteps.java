package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Navigate to Amazon Fresh {string}")
    public void navigate_to_amazon_fresh(String string) {
        System.out.println("Navigate to Fresh Url");
    }
    @When("Add the items to Fresh cart")
    public void add_the_items_to_fresh_cart() {
        System.out.println("Add to Fresh ");
    }
    @Then("Complete the Payment")
    public void complete_the_payment() {
        System.out.println("Done the Fresh Payment");
    }

    @Given("Navigate to Amazon Prime {string}")
    public void navigate_to_amazon_prime(String string) {
        System.out.println("Navigate to Prime Url");

    }
    @When("Add the movies to Prime cart")
    public void add_the_movies_to_prime_cart() {
        System.out.println("Add to Prime ");
    }
    @Then("Complete the Payments")
    public void complete_the_payments() {
        System.out.println("Done the Prime Payment");
    }

    @Given("Navigate to Amazon Pay {string}")
    public void navigate_to_amazon_pay(String string) {
        System.out.println("Navigate to Pay Url");
    }
    @When("Add the amount to amazon pay")
    public void add_the_amount_to_amazon_pay() {
        System.out.println("Add to Pay ");
    }
    @Then("Complete the repayment")
    public void complete_the_repayment() {
        System.out.println("Done the Pay Payment");

    }

}
