package org.example.Step_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;


    @Before
    public static void open_browser(){

        System.setProperty("webdriver.chrome.driver" , "D:\\E-Commerce Website Project\\E-Commerce_Website_Testing\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
