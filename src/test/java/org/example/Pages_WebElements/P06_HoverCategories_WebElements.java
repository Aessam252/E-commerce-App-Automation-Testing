package org.example.Pages_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.example.Step_Definitions.Hooks.driver;

public class P06_HoverCategories_WebElements {


    public List<WebElement> categories(){

        List<WebElement> categories = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));

        return categories;
    }


    public List<WebElement> subCategories(){

        List<WebElement> subCategories = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href]"));

        return subCategories;
    }

    public WebElement desktop(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/desktops\"]"));
    }

    public WebElement notebooks(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/notebooks\"]"));
    }

    public WebElement software(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/software\"]"));
    }



    public WebElement camera_and_photo(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/camera-photo\"]"));
    }

    public WebElement cellphones(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/cell-phones\"]"));

    }

    public WebElement others(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/others\"]"));

    }



    public WebElement shoes(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/shoes\"]"));

    }

    public WebElement clothing(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/clothing\"]"));
    }

    public WebElement accessories(){

        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/accessories\"]"));
    }

    public WebElement subPage_Title(){

        return driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }





}
