package com.mtboypbtwoyf.webapplication.tesco.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class CustomChromeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        try {
            ChromeDriverManager.getInstance().setup();
            WebDriverManager.chromedriver().version("2.37").setup();
            final ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--no-sandbox", "--disable-gpu");
            chromeOptions.setAcceptInsecureCerts(true);
            if (SystemUtils.IS_OS_LINUX) {
                chromeOptions.setHeadless(true);
            } else if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_WINDOWS) {
                chromeOptions.addArguments("--start-fullscreen");
            }
            chromeOptions.addArguments
                    ("--no-first-run", "--homepage=about:blank", "--incognito", "--disable-download-notification");
            return new ChromeDriver(ChromeDriverService.createDefaultService(), chromeOptions);
        } catch (Exception e) {
            throw new UnreachableBrowserException(e.getMessage());
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
