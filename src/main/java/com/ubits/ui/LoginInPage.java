package com.ubits.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginInPage extends PageObject {


    public static final Target  TXT_USER = Target.the("user").located(By.id("user"));
    public static final Target  TXT_PASS = Target.the("pass").located(By.id("pass"));
    public static final Target  BTN_LOGIN = Target.the("login").located(By.id("submit"));

}
