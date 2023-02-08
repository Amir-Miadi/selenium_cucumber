@authentification
Feature: Authentification de login de l application swagLabs
  En tant que utilisateur  je souhaite naviger

  @login_CasPassant
  Scenario: Authentification sur l application SwagLabs- Cas Passant
    Given je me connecte sur l application SwagLabs
    When je saisis le username "standard _user"
    And je saisis le mot de pass "secret_sauce"
    And je clique sur le bouton login
    Then je me redirige vers la page home "PRODUCTS"
