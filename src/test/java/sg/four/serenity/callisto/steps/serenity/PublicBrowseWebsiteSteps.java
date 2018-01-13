package sg.four.serenity.callisto.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sg.four.serenity.callisto.pages.SectionPage;

import java.util.List;

import static net.serenitybdd.core.pages.PageObject.withParameters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PublicBrowseWebsiteSteps extends ScenarioSteps {

    SectionPage page;

    @Step
    public void browse() {
        page.open();
        page.open("section", withParameters("schools"));
        page.open("section", withParameters("workplace"));
        page.open("section", withParameters("community"));
        page.open("section", withParameters("healthy-living"));
        page.open("section", withParameters("partners"));

        /*
        page.open("section", withParameters("sitemap"));
        page.open("section", withParameters("services"));
        page.open("section", withParameters("contact-us"));
        page.open("section", withParameters("feedback"));
        page.open("section", withParameters("faq"));
        page.open("section", withParameters("privacy-statement"));
        page.open("section", withParameters("terms-of-use"));
        page.open("section", withParameters("data-protection-policy"));
        page.open("section", withParameters("archive"));
        page.open("section", withParameters("resources"));
        page.open("section", withParameters("newsrooms"));
        */
    }

    @Step
    public void gotoAbout() {
        page.open("about", withParameters("about-us"));
    }

    @Step
    public void gotoWorkplace() {
        page.open("careers", withParameters("job-opportunities"));
        page.open("careers", withParameters("scholarships"));
        page.open("careers", withParameters("internship-programmes"));
    }
}