package com.askgamblers.cm.automation.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "classpath:features/search.feature" },
        glue = {"com.askgamblers.cm.automation.runner.LoginSteps" })
public class TestRunner {
}
