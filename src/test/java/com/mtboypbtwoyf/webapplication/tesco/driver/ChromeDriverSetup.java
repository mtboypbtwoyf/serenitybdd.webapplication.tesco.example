package com.mtboypbtwoyf.webapplication.tesco.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;

public class ChromeDriverSetup {
    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }
}
