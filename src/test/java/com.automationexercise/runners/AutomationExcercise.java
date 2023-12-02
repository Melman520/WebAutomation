package com.automationexercise.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.automationexercise.stepdefinitions"},
        features = {"src/test/resources/features/auatomationExercise.feature"},
        tags = ""
)

public class AutomationExcercise {
}
