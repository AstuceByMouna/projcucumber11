package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ConfigPack.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MystepDefinition2 extends Base {

	 @Given("^I visit login page$")
	    public void i_visit_login_page() throws Throwable {
		 
		driver = Base.getDriver();
				driver.get("https://www.facebook.com/");
	    }

	    @When("^I enter \"([^\"]*)\" in the user name field and \"([^\"]*)\" in the passsword field$")
	    public void i_enter_something_in_the_user_name_field_and_something_in_the_passsword_field(String strArg1, String strArg2) throws Throwable {
	    }

	    @Then("^I should see an error message$")
	    public void i_should_see_an_error_message() throws Throwable {
	    }

	    @And("^I press the access button$")
	    public void i_press_the_access_button() throws Throwable {
	    }

	    @And("^user is connected \"([^\"]*)\"$")
	    public void user_is_connected_something(String strArg1) throws Throwable {
	    }

}