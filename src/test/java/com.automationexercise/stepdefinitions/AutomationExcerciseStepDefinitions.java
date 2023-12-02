package com.automationexercise.stepdefinitions;

import com.automationexercise.questions.*;
import com.automationexercise.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationExcerciseStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {string} open browser")
    public void givenTheBrowserIsLaunched(String actorName) {
        theActorCalled(actorName).wasAbleTo();
    }

    @When("the user navigates to the url automationexercise.com")
    public void whenTheUserNavigatesToTheUrlAutomationexerciseCom() {
        theActorInTheSpotlight().attemptsTo(GoTo.theUrl());
    }


    @Then("the home page should be visible successfully")
    public void thenTheHomePageShouldBeVisibleSuccessfully() {
        theActorInTheSpotlight().should(seeThat(PageWas.Visible()));
    }
}