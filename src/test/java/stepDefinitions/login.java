package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    @Given("User is on test server")
    public void user_is_on_test_server() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("testServer");
        System.out.println("testing git commands");
        //throw new io.cucumber.java.PendingException();
    }

    @When("Teacher provides correct credentials")
    public void teacher_provides_correct_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("credentials");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("Teacher home page appears")
    public void teacher_home_page_appears() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("teacher home page");
        //throw new io.cucumber.java.PendingException();
    }

}
