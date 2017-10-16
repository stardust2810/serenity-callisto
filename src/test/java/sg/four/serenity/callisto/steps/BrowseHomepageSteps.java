package sg.four.serenity.callisto.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sg.four.serenity.callisto.steps.serenity.PublicBrowseHomepageSteps;

public class BrowseHomepageSteps {

    @Steps
    PublicBrowseHomepageSteps public_user;

    @Given("user visits the Corporate Website")
    public void userIsAtTheHomePage() {
        public_user.goes_to_home();
    }

    @When("user sees '(.*)' sections")
    public void userSeesSections(String sections) {
        String[] section = sections.split(",");
        for(int x=0;x<section.length;x++)
            public_user.scrolls_to_section(section[x]);
    }

    @Given("user sees the About section in the website")
    public void user_sees_the_about_section_in_the_website() {
        public_user.goes_to_home();
        public_user.sees_main_nav_bar();
    }

    @Given("user sees the testimonial section in the website")
    public void user_sees_the_testimonial_section_in_the_website() {
        public_user.goes_to_home();
        public_user.sees_testimonials();
    }

    /*
    @When("user scrolls to '(.*)' section")
    public void whenTheUserScrollsToSection(String word) {
        String[] tabs = word.split(",");
        for(int x=0;x<tabs.length;x++)
            joe.scrolls_to_section(tabs[x]);
    }
    */
    //@Then("they should see '(.*)' tabs")
    /*
    public void thenTheyShouldSee(String title) {
        String[] tabs = word.split(",");
        for(x=0;x=tabs.length;x++)
            joe.scrolls_to_section(tabs[x]);
    }
    */
}
