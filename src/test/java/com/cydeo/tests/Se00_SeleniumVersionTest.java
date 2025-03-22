package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Se00_SeleniumVersionTest {


    //Generate Test Method
 //ALT+INSERT
 //COMMAND + N


    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); //Polymorphism
        driver.get("https://www.google.com");

        driver.navigate().refresh(); //method chaining


    }
}
