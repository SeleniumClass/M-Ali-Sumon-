package webStep;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webPages.WebTable;

public class WebTable1 {
	WebDriver driver;
	WebTable wt;
	
	
	@Given("^User open chrome browser$")
	public void user_open_chrome_browser() throws Throwable {
	    
	}

	@Given("^User lunch the premier league home page$")
	public void user_lunch_the_premier_league_home_page() throws Throwable {
	    
	}

	@When("^User grab all club name and findout total number of club User show all club name on the console$")
	public void user_grab_all_club_name_and_findout_total_number_of_club_User_show_all_club_name_on_the_console() throws Throwable {
	   
	}

	@Then("^Validate Chelsea is there or not$")
	public void validate_Chelsea_is_there_or_not() throws Throwable {
	   
	}

	@Then("^User find out the chelsea club position$")
	public void user_find_out_the_chelsea_club_position() throws Throwable {
	   
	}

	@Then("^Validate Chelsea position is (\\d+) or not$")
	public void validate_Chelsea_position_is_or_not(int arg1) throws Throwable {
	    
	}


}
