package com.ubits.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebSidePage extends PageObject {
    public static final Target TAG_LOGIN = Target.the("login").located(By.id("loginr"));
}
