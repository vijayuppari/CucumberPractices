package Stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationsteps {

    @Given("User navigated to the Registration Form")
    public void user_navigated_to_the_registration_form() {
        System.out.println("User Navigated to Form");
    }
    @When("User filled the form with below details")
    public void user_filled_the_form_with_below_details(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> datainfo = dataTable.asLists(String.class);
        for(List<String> s1: datainfo){
            System.out.println(s1);
        }
    }

    @When("User filled the form with below details with columns")
    public void user_filled_the_form_with_below_details_with_columns(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<Map<String, String>> datacolumnsinfo = dataTable.asMaps(String.class, String.class);
       /* System.out.println(datacolumnsinfo);
        System.out.println(datacolumnsinfo.get(1).get("FirstName"));*/
        for(Map<String,String> el: datacolumnsinfo){
            System.out.println(el.get("FirstName"));
            System.out.println(el.get("LastName"));
            System.out.println(el.get("Email"));
            System.out.println(el.get("City"));
        }
    }
    @Then("User successfully form completed")
    public void user_successfully_form_completed() {
        System.out.println("User completed the Form Filling");
    }

}
