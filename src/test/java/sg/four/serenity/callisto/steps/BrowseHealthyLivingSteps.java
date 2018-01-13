package sg.four.serenity.callisto.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sg.four.serenity.callisto.steps.serenity.PublicBrowseHealthyLivingSteps;

public class BrowseHealthyLivingSteps {

    @Steps
    PublicBrowseHealthyLivingSteps user;

    @Given("user visits the Healthy Living Page")
    public void userIsAtTheHealthyLivingPage() {
        user.opens();
    }

    @When("the page loads")
    public void the_page_loads() {
        user.sees_page();
    }

    @Then("they should see the intro text '(.*)'")
    public void they_should_see_the_intro_text(String text) {
        user.see_intro_text(text);
    }
}
