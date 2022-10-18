package com.ubits.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.ubits.ui.PayFormPage.LBL_FORM_PAYMENT;

public class FormPayment implements Question<String> {

    public static Question<String> displayed() {
        return new FormPayment();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_FORM_PAYMENT.resolveFor(actor).getText();
    }

}
