package org.example.Pages_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Step_Definitions.Hooks.driver;

public class P03_ResetPassword_WebElements {

    public WebElement resetPassword(){
       return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement recoverButton(){
        return driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
    }
}
