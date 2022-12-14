package org.example.Pages_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.example.Step_Definitions.Hooks.driver;

public class P09_Wishlist_WebElements {

    public List<WebElement> wishlist_btn(){
        List<WebElement> wishlistBtns = driver.findElements(By.cssSelector("div[class=\"add-info\"]>div[class=\"buttons\"]>button[class=\"button-2 add-to-wishlist-button\"]"));
        return wishlistBtns;
    }

    public WebElement successMsg(){
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishlistTab(){
        return driver.findElement(By.className("wishlist-label"));
    }


}
