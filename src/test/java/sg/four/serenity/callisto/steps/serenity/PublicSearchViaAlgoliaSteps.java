package sg.four.serenity.callisto.steps.serenity;

import net.thucydides.core.annotations.Step;
import sg.four.serenity.callisto.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PublicSearchViaAlgoliaSteps {

    HomePage home;

    @Step
    public void goes_to_home() { home.open(); }

    @Step
    public void should_see_page(String title) {
        assertThat(home.getTitle(), containsString(title));
    }

    @Step
    public void looks_for(String term) {
        home.enter_search(term);
    }
}