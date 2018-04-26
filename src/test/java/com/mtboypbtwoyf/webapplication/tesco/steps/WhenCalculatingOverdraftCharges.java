package com.mtboypbtwoyf.webapplication.tesco.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// TODO: 22/04/2018 Complete missing steps
// TODO: 26/04/2018 WIP
public class WhenCalculatingOverdraftCharges {

    @Given("^(?:a|an) (.*) user is interested in arranging an overdraft$")
    public void user_is_interested_in_arranging_an_overdraft(String userType) {
    }

    @Given("^a (.*) user is interested in (\\d+) days overdraft$")
    public void aNewUserIsInterestedInDaysOverdraft(String userType, int days) {
        user_is_interested_in_arranging_an_overdraft(userType);
    }

    @When("^the user calculates overdraft charges$")
    public void theUserCalculatesOverdraftCharges() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the overdraft charges should be displayed$")
    public void theOverdraftChargesShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions
    }
}
