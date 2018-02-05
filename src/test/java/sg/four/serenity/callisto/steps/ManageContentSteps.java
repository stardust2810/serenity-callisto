package sg.four.serenity.callisto.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import sg.four.serenity.callisto.questions.*;
import sg.four.serenity.callisto.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class ManageContentSteps {
    @Managed
    WebDriver theBrowser;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) creates a new page")
    public void creates_a_new_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSitefinityCloudDashboardPage.open());
        //theActorCalled(actorName).attemptsTo(FillUpSitefinityLoginForm.entersDetails("jeffrey", "test12345611222333"));
        //theActorCalled(actorName).should(seeThat(RateThisSiteFormResults.text(),containsString("Thank you for filling out the survey!")));
    }
}
