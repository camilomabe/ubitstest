package com.ubits.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayFormPage {

    public static final Target LBL_FORM_PAYMENT = Target.the("form payment text").located(By.xpath("//h2[contains(text(),'Formulario de pago')]"));


}
