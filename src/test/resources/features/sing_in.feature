Feature: Login in with correct credentials

  As a user of the camilomabe web side
  I want to sing in
  To verify that my credentials are correct

  @Login
  Scenario Outline: Login with correct credentials
    Given Camilo opens the browser in the login home
    When He enters his credentials <email> and <pass>
    Then He validate text on payment form <text>

    Examples:
      | email            | pass     | text               |
      | camilo@gmail.com | Camilo@G | Formulario de pago |