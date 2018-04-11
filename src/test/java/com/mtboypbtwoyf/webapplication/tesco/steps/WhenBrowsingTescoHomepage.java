package com.mtboypbtwoyf.webapplication.tesco.steps;

import com.mtboypbtwoyf.webapplication.tesco.steplib.NavigatingUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WhenBrowsingTescoHomepage {
    @Steps
    NavigatingUser user;

    @Given("^user is on the tesco homepage$")
    public void userIsOnTheTescoHomepage() {
        user.isOnTheHompage();
    }

    @When("^user clicks groceries from the homepage menu option$")
    public void userClicksGroceriesFromTheHomepageMenuOption() {
        user.selectGroceriesFromTheNavBar();
    }

    @Then("^user can see expected page title$")
    public void userCanSeeExpectedPageTitle() {
        user.shouldSeePageTitleContaining
                ("Tesco Groceries | Online Food Shopping & Delivery | Order Food Online");
    }
}
