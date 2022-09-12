package StepDefination;

import io.cucumber.java.en.*;

public class Actime {
	@Given("User is on login page")
	public void user_is_on_login_page() {
 	     System.out.println("Hiii");
	}

	@When("User enter un and pwd")
	public void user_enter_un_and_pwd() {
	     System.out.println("Hello");
 	}

	@When("click on login btn")
	public void click_on_login_btn() {
	     System.out.println("Bye");
 	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	     System.out.println("How are you ");
		System.out.println("How");
 	}

}
