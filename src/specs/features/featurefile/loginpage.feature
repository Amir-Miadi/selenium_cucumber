@authentification
Feature: Authentification de login de l application nopcommerce
  En tant que utilisateur  je souhaite naviger

  @login_CasPassant
  Scenario: Authentification sur l application nopcommerce- Cas Passant
    Given je me connecte sur l application nopcommerce
    When je saisis le username "admin@yourstore.com"
    And je saisis le mot de pass "admin"
    And je clique sur le bouton login
    Then je me redirige vers la page home ""
