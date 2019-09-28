package io.cucumber.skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class Steps {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }


    @When("^I wait (\\d+) hour$") public void iWaitHour(int arg0) throws Throwable {
    }

    @Then("^my belly should growl$") public void myBellyShouldGrowl() throws Throwable {
    }
}
