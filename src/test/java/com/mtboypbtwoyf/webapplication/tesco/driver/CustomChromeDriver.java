package com.mtboypbtwoyf.webapplication.tesco.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class CustomChromeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        try {
            ChromeDriverManager.getInstance().setup();
            WebDriverManager.chromedriver().version("2.37").setup();

            final ChromeOptions chromeOptions = new ChromeOptions();
            if (SystemUtils.IS_OS_LINUX) {
                chromeOptions.addArguments("--headless", "--ignore-certificate-errors", "--allow-running-insecure-content", "--disable-web-security", "--disable-download-notification", "--no-sandbox", "--disable-gpu");
                chromeOptions.setAcceptInsecureCerts(true);

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.acceptInsecureCerts();
            } else if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_WINDOWS) {
                chromeOptions.addArguments( "--incognito", "--start-fullscreen","--ignore-certificate-errors","--disable-download-notification","--no-sandbox","--disable-gpu");
                chromeOptions.setAcceptInsecureCerts(true);
            }

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
