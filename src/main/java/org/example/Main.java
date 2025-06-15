package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;


public class Main {
    public static WebDriver driver;
    public static void main(String[] args) {
            ChromeOpen();
        }

    public static void ChromeOpen(){
        System.setProperty("webdriver.chrome.driver","/Users/abir/stpa_automation/Test_Basic_CI_CD/src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //wait for element always
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to url
        driver.get("https://www.webpagetest.org/");




    }
}