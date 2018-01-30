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

    @Given("^(.*) wants to read N\\.O\\.W Issues$")
    public void user_wants_to_read_N_O_W_Issues(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(GoToNOWLandingPage.open());
        theActorCalled(actorName).should(seeThat(NOWArticleListResults.cards_shown(), hasItem(containsString("N.O.W Issue 1"))));
        theActorCalled(actorName).should(seeThat(NOWArticleListResults.cards_shown(), hasItem(containsString("N.O.W Issue 2"))));
    }


    @Given("^(.*) searches for (.*) within the faq section")
    public void search_within_the_faq_section(String actorName, String search_term) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenFAQPage.open());
        theActorCalled(actorName).attemptsTo(DoASearchinFAQ.enterSearch(search_term));
        //theActorCalled(actorName).should(seeThat(FAQSearchResults.text(),is("Healthier Ingredient Scheme")));
    }

    @Then("^(.*) should see the faq programme (.*) displayed$")
    public void the_faq_programme_displayed(String actorName, String programme_name) throws Throwable {
        theActorCalled(actorName).should(seeThat(FAQSearchResults.text(),is(programme_name)));
    }

    @Given("^(.*) submits a feedback$")
    public void submits_a_feedback(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenFeedbackPage.open());
        theActorCalled(actorName).attemptsTo(FillUpFeedbackForm.entersDetails("Suggestions", "Allow me to update my appointment online", "onlyyou@hotmail.com", "Joe Tan"));
        //theActorCalled(actorName).should(seeThat(FeedbackFormResults.text(),is("Thank you for your feedback! We will take down your message and get back to you very soon!")));
    }

    @Given("^(.*) visits the about page$")
    public void visits_the_about_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenAboutPage.open());
        theActorCalled(actorName).should(seeThat(AboutPageResults.text(),containsString("Established in 2001, the Health Promotion Board (HPB) is a government organisation committed to promoting healthy living in Singapore. HPB is a credible and authoritative source of evidence-based health information that seeks to empower the Singapore public with knowledge and skills to take ownership of their health and live a healthy lifestyle. We, in turn, are guided by evidence-based health knowledge to formulate and implement health policies and programmes that will improve the nation’s health.")));
    }

    @Given("^(.*) visits the workplace page$")
    public void visits_the_workplace_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenWorkplacePage.open());
        theActorCalled(actorName).should(seeThat(WorkplacePageResults.text(),containsString("The workplace is where most adult Singaporeans spend a majority of their day at, and is thus a key setting for health promotion. Companies and organisations can have a positive influence on their employee’s health, through creating the right type of working environment.")));
    }

    @Given("^(.*) visits the schools page$")
    public void visits_the_schools_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenSchoolsPage.open());
        theActorCalled(actorName).should(seeThat(SchoolsPageResults.text(),containsString("Schools are a large part of a student’s life, and can play an important role in establishing life-long healthy habits. As such, we work closely with schools to create health promoting environments where students can play, learn, and grow in.")));
    }

    @Given("^(.*) visits the community page$")
    public void visits_the_community_page(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(OpenCommunityPage.open());
        theActorCalled(actorName).should(seeThat(CommunityPageResults.text(),containsString("By promoting the importance of healthy living anytime and anywhere, as envisioned in the Healthy Living Master Plan, HPB aims to drive sustainable behaviour change and ultimately foster a community that embraces healthy living!")));
    }
}
