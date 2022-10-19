package com.ubits.tasks;

import com.ubits.interactions.GoesLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;

import static com.ubits.ui.LoginInPage.*;
import static com.ubits.ui.WebSidePage.TAG_LOGIN;
import static com.ubits.utils.Constants.WAIT_FOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class EntersCredential implements Task {

    private final String email;
    private final String pass;

    public EntersCredential(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    @Step("{0} goes to login in website")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GoesLogin.letsGo());
        actor.attemptsTo(Wait.until(the(TXT_USER), isPresent()).forNoLongerThan(WAIT_FOR).seconds());
        actor.attemptsTo(Enter.theValue(email).into(TXT_USER));
        actor.attemptsTo(Enter.theValue(pass).into(TXT_PASS));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static Performable forLoginIn(String email, String pass) {
        return Tasks.instrumented(EntersCredential.class, email, pass);
    }

}
