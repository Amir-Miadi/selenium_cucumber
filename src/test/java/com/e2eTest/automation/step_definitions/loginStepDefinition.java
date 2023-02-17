package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage ;
	public LoginStepDefinition() {
		loginPage = new LoginPage ()	;
	}

	@Given("je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();

	}

	@When("je saisis le username {string}")
	public void jeSaisisLeUsername(String email) {
		loginPage.fillEmail(email);
	}

	@When("je saisis le mot de pass {string}")
	public void jeSaisisLeMotDePass(String password) {
		loginPage.fillPassword(password);

	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin(){
		loginPage.clickOnBtnLogin();

	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
		

	}

}
