Feature: Login in with correct credentials

  As a user of the camilomabe web side
  I want to sing in
  To verify that my credentials are correct

  @Login
  Scenario Outline: Login with correct credentials
    Given Camilo opens the browser in the home page
    When he enters his credentials, <email> and <pass>
    Then he should see the <text> in the payment form

    Examples:
      | email             | pass    | text               |
      | edelgado@ubits.co | ubits@G | Formulario de pago |
      #| malzate@ubits.co  | ubits@G  | Formulario de pago |
      #| camilo@gmail.com  | Camilo@G | Formulario de pago |