package com.mtboypbtwoyf.webapplication.tesco.steplib;

import com.mtboypbtwoyf.webapplication.tesco.ui.CurrentPage;
import com.mtboypbtwoyf.webapplication.tesco.ui.HomePageNavigationBar;
import com.mtboypbtwoyf.webapplication.tesco.ui.TescoHomePage;
import cucumber.api.formatter.AnsiEscapes;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser extends ScenarioSteps {

    TescoHomePage tescoHomePage;
    CurrentPage currentPage;
    HomePageNavigationBar homePageNavigationBar;

    @Step("Open Tesco Homepage")
    public void isOnTheHompage() {
        tescoHomePage.open();
    }

    @Step("Should see expected page title")
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
        System.out.println("You are now on: " + AnsiEscapes.MAGENTA + currentPage.getTitle() + AnsiEscapes.RESET);
    }


    @Step("Select Groceries from menu NavBar")
    public void selectGroceriesFromTheNavBar() {
        homePageNavigationBar.clickGroceriesNavOption();
    }

    @Step("Select specific homepage nav bar option")
    public void clickSpecifiedNavOption(String navOption) {
        homePageNavigationBar.clickNavOption(navOption);

    }

    @Step("User is on the Groceries homepage")
    public void isOnGroceriesHomepage() {
        isOnTheHompage();
        selectGroceriesFromTheNavBar();
        assertThat(currentPage.getTitle()).startsWith("Tesco Groceries");
    }
}
