package sg.four.serenity.callisto.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sg.four.serenity.callisto.pages.HealthLivingPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PublicBrowseHealthyLivingSteps extends ScenarioSteps {

    HealthLivingPage page;

    @Step
    public void opens() { page.open(); }

    @Step
    public void sees_page() {
        boolean ok = true;
        System.out.println(page.getTitle());
        if(!page.getTitle().equalsIgnoreCase("Healthy Living"))
            ok = false;
        assertThat(ok, is(true));
    }

    @Step
    public void see_intro_text(String text) {
        boolean ok = true;

        System.out.println(page.getIntroText());
        if(!page.getIntroText().equalsIgnoreCase(text))
            ok = false;
        assertThat(ok, is(true));
    }
}