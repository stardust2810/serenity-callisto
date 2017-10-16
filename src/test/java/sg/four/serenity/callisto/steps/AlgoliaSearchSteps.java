package sg.four.serenity.callisto.steps;

import sg.four.serenity.callisto.steps.serenity.PublicSearchViaAlgoliaSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlgoliaSearchSteps {

    @Steps
    PublicSearchViaAlgoliaSteps public_user;

    @Given("user is at the home page")
    public void userIsAtTheHomePage() {
        public_user.goes_to_home();
    }

    @When("the user searches for '(.*)'")
    public void whenTheUserSearchesFor(String word) {
        public_user.looks_for(word);
    }

    @Then("they should see '(.*)' page")
    public void thenTheyShouldSee(String title) {
        public_user.should_see_page(title);
    }
}
