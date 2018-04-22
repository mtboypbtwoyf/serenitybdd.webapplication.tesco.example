package com.mtboypbtwoyf.webapplication.tesco.ui;

import cucumber.api.formatter.AnsiEscapes;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageNavBar extends PageObject {

    public void clickGroceriesNavOption() {
        find(By.cssSelector("#tab-Groceries > div")).click();
    }

    public void clickNavOption(String navOption) {
        $("#navbar > ul").findBy(By.linkText(navOption)).click();
        System.out.println("You have selected: " + AnsiEscapes.YELLOW + navOption + AnsiEscapes.RESET);
    }
}
