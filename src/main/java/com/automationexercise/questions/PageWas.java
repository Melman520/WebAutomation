package com.automationexercise.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.automationexercise.ui.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PageWas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor){
        actor.attemptsTo(
                WaitUntil.the(SLIDER, isVisible()).forNoMoreThan(20).seconds()
        );
        return true;
    }
    public static PageWas Visible() {return new PageWas();}
}