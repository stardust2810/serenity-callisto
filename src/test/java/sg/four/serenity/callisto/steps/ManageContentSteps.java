package sg.four.serenity.callisto.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import sg.four.serenity.callisto.questions.*;
import sg.four.serenity.callisto.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import net.serenitybdd.screenplay.matchers.statematchers.IsCurrentlyVisibleMatcher;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;


public class ManageContentSteps {
    private static Logger log = LogManager.getLogger(ManageContentSteps.class);

    @Managed
    WebDriver theBrowser;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) tries to log in to the CMS with wrong password")
    public void tries_to_log_in_to_the_CMS_with_wrong_password(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSitefinityDashboardPage.open());
        theActorCalled(actorName).attemptsTo(FillUpSitefinityLoginForm.entersDetails("jenny", "test12345611222333"));
        //should check for visiblility first
        theActorCalled(actorName).should(seeThat(LoginFormFailureResults.text(),containsString("Incorrect username and password combination")));
    }

    @Given("^(.*) creates a new page")
    public void creates_a_new_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSitefinityDashboardPage.open());
        theActorCalled(actorName).attemptsTo(FillUpSitefinityLoginForm.entersDetails("jeffrey", "C@llisto3107"));
        theActorCalled(actorName).attemptsTo(CreateNewPage.createAPage());
    }

    @Given("^(.*) tries to reset password")
    public void tries_to_reset_password(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSitefinityDashboardPage.open());
        theActorCalled(actorName).attemptsTo(SitefinityResetPassword.resetPassword());
        //https://beta-uat-m2.hpb.gov.sg/TFA/Authenticate/ForgetPassword?Length=0
        theActorCalled(actorName).attemptsTo(FillUpSitefinityResetPasswordForm.entersDetails("jenny"));
        theActorCalled(actorName).should(seeThat(SitefinityResetPasswordResults.text(),containsString("An email with a link to reset your password has been sent to your email.")));
    }

    @Given("^(.*) creates page in sitefinity cloud")
    public void creates_page_in_sitefinity_cloud(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSitefinityCloudDashboardPage.open());
        //theActorCalled(actorName).attemptsTo(FillUpSitefinityLoginForm.entersDetails("jeffrey", "C@llisto3107"));
        theActorCalled(actorName).attemptsTo(CreateNewPage.createAPage());
    }
}
