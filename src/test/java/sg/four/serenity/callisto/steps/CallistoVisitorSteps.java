package sg.four.serenity.callisto.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import sg.four.serenity.callisto.questions.NOWArticleListResults;
import sg.four.serenity.callisto.tasks.GoToNOWLandingPage;
import sg.four.serenity.callisto.tasks.OpenHomePage;
import sg.four.serenity.callisto.tasks.DoASearch;
import sg.four.serenity.callisto.tasks.ScrollToSection;
import sg.four.serenity.callisto.questions.AlgoliaSearchResults;
import sg.four.serenity.callisto.questions.MainMenuItemResults;
import sg.four.serenity.callisto.questions.UsefulInfoTabItemResults;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.core.Is.is;


public class CallistoVisitorSteps {
    @Managed
    WebDriver theBrowser;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) searches for (.*) using the website search$")
    public void searches_the_website(String actorName, String search_term) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenHomePage.loads_home());
        theActorCalled(actorName).attemptsTo(DoASearch.enterSearch(search_term));
        theActorCalled(actorName).should(seeThat(AlgoliaSearchResults.text(),is("For more health information, tips and tricks, visit HealthHub.")));
    }

    @Given("^(.*) sees the navigation menu$")
    public void user_can_see_the_navigation_menu(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenHomePage.loads_home());
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Home"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("About"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Workplace"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Schools"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Community"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Healthy Living"))));
        theActorCalled(actorName).should(seeThat(MainMenuItemResults.menu_items_shown(), hasItem(containsString("Partnerships"))));
    }

    @Given("^(.*) sees the useful info tabs$")
    public void user_can_see_the_useful_info_tabs(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenHomePage.loads_home());
        //section names on the landing page : home-banner,home-first-section,home-second-section,home-last-section,footer
        theActorCalled(actorName).attemptsTo(ScrollToSection.called("home-first-section"));
        theActorCalled(actorName).should(seeThat(UsefulInfoTabItemResults.tabs_shown(), hasItem(containsString("Educators and Parents"))));
        theActorCalled(actorName).should(seeThat(UsefulInfoTabItemResults.tabs_shown(), hasItem(containsString("Community Partners"))));
        theActorCalled(actorName).should(seeThat(UsefulInfoTabItemResults.tabs_shown(), hasItem(containsString("Corporate Partners"))));
        theActorCalled(actorName).should(seeThat(UsefulInfoTabItemResults.tabs_shown(), hasItem(containsString("Grant Applicants"))));
    }

    @Given("^(.*) wants to read N.O.W Issue$")
    public void read_enews_from_now(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(GoToNOWLandingPage.open());
        theActorCalled(actorName).should(seeThat(NOWArticleListResults.cards_shown(), hasItem(containsString("N.O.W Issue 1"))));
        theActorCalled(actorName).should(seeThat(NOWArticleListResults.cards_shown(), hasItem(containsString("N.O.W Issue 2"))));
    }

    @Given("^(.*) wants to search both the local and gov faqs")
    public void search_local_and_gov_faqs throws Throwable {

    }
}
