package org.example.Step_Definitions;

import io.cucumber.java.en.Given;
import org.example.Pages_WebElements.P01_Registration_WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.Step_Definitions.Hooks.driver;


public class D01_Registration_StepDefinitions {


    P01_Registration_WebElements register = new P01_Registration_WebElements(driver);
    @Given("user goes to register page")
    public void register_Page(){

        register.registerOption().click();
    }


    @When("user enters valid data")
    public void validData() throws InterruptedException {

        register.genderMale_Radio().click();

        Thread.sleep(1000);

        register.firstName().sendKeys("Ahmed");
        register.lastName().sendKeys("Essam");

        Thread.sleep(1000);



        Select select = new Select(register.birthDay());
        select.selectByIndex(2);

        select = new Select(register.birthMonth());
        select.selectByValue("8");

        select = new Select(register.birthYear());
        select.selectByVisibleText("1997");

        Thread.sleep(1000);

        register.email().sendKeys("aessam@gmail.com");

        Thread.sleep(1000);

        register.companyName().sendKeys("Alfa Healthcare");
        register.newsLetterCheckBox().click();

        Thread.sleep(1000);

        register.password().sendKeys("123456");
        register.confirmPassword().sendKeys("123456");

        Thread.sleep(2000);
    }

    @And("user click on register option")
    public void registerClick() throws InterruptedException {
        register.registerButton().click();

        Thread.sleep(3000);
    }


    @Then("user should register successfully")
    public void successful_Registration(){
        Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed() , "Assertion of SuccessfulRegistration error");
    }

    @And("registration completion message should appear")
    public void success_message(){

        SoftAssert soft = new SoftAssert();

        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();

        WebElement successMsg = driver.findElement(By.cssSelector("div[class=\"result\"]"));
        soft.assertTrue(actualResult.contains(expectedResult) , "Assertion of registration success message error");

        String Msg_backgroundColor = successMsg.getCssValue("color");
        soft.assertEquals(Msg_backgroundColor, "rgba(75, 177, 124, 1)");


    }

}
