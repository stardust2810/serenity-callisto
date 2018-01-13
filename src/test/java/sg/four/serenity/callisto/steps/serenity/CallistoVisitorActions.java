package sg.four.serenity.callisto.steps.serenity;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import sg.four.serenity.callisto.pages.DictionaryPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sg.four.serenity.callisto.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class CallistoVisitorActions {
    HomePage page;

    @Step
    public void loads_home() { page.open(); }

}