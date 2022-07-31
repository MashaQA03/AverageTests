package com.incollect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
    public ChromeDriver driver;
    @Before
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
        @After
        public void finish(){
            driver.quit();
        }
}

