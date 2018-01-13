package sg.four.serenity.callisto.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sg.four.serenity.callisto.steps.serenity.PublicBrowseWebsiteSteps;

public class BrowseWebsiteSteps {

    @Steps
    PublicBrowseWebsiteSteps visitor;

    @Given("user can view the major sections")
    public void user_can_view_the_major_sections() {
        visitor.browse();
    }
}
