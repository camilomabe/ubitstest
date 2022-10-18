package com.ubits.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theWebSideHome() {
        return Task.where("{0} opens the camilomabe home page",
                Open.browserOn().the(OpensBrowserOn.class));
    }
}
