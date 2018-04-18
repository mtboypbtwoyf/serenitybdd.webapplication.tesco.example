package com.mtboypbtwoyf.webapplication.tesco.steps;

import com.mtboypbtwoyf.webapplication.tesco.model.Groceries;
import com.mtboypbtwoyf.webapplication.tesco.steplib.NavigatingUser;
import com.mtboypbtwoyf.webapplication.tesco.ui.GroceriesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class WhenBrowsingTescoGroceriesHomepage {

    @Steps
    NavigatingUser user;

    @Steps
    GroceriesPage groceriesPage;

    @Given("^user is on the tesco groceries page$")
    public void userIsOnTheTescoGroceriesPage() {
        user.isOnGroceriesHomepage();
    }

    // TODO: 18/04/2018 TBC
    @Then("^should be able to select all menu options$")
    public void shouldBeAbleToSelectAllMenuOptions() {
        Groceries[] groceries = Groceries.class.getEnumConstants();
        groceriesPage.selectAllMenuOptions(groceries);
    }
}
