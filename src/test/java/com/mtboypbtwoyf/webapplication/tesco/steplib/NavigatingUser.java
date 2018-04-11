package com.mtboypbtwoyf.webapplication.tesco.steplib;

import com.mtboypbtwoyf.webapplication.tesco.ui.CurrentPage;
import com.mtboypbtwoyf.webapplication.tesco.ui.HomePageNavigationBar;
import com.mtboypbtwoyf.webapplication.tesco.ui.TescoHomePage;
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
    }

    @Step
    public void selectsAnOptionFromTheNavBar() {
        homePageNavigationBar.selectFromNavBar();
    }

    @Step("Select Groceries from menu NavBar")
    public void selectGroceriesFromTheNavBar() {
        homePageNavigationBar.selectGroceriesMenuOption();
    }
}
