package com.mtboypbtwoyf.webapplication.tesco.ui;

import com.mtboypbtwoyf.webapplication.tesco.driver.CustomChromeDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageNavigationBar extends PageObject {
    @FindBy(id = "tab-Groceries")
    private List<WebElement> navbarMenuContainer;

    @FindBy(id = "tab-Groceries")
    private WebElementFacade groceriesLink;

    public void selectGroceriesMenuOption() {
        groceriesLink.waitUntilVisible().click();
    }

    public void selectFromNavBar() {
//            navbarMenuContainer
//                    .stream()
//                    .filter(element -> element.getText().equalsIgnoreCase(navOption.name()))
//                    .findAny()
//                    .ifPresent(WebElement::click);
//
    }
}
