package org.example.Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features_Folder",
        glue = "org.example.Step_Definitions",
        tags = "@smoke",
        plugin = { "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cukes.xml",
        "rerun:target/rerun.txt"}
                )

public class TestRunner extends AbstractTestNGCucumberTests {
}
