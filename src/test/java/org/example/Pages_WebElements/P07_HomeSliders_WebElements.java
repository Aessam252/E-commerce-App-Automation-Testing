package org.example.Pages_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.Step_Definitions.Hooks.driver;

public class P07_HomeSliders_WebElements {

    public List<WebElement> slider(){

        List<WebElement> sliders = driver.findElements(By.cssSelector("div[id=\"nivo-slider\"]>a[href=\"http://demo.nopcommerce.com/\"]"));
        return sliders;
    }
}
