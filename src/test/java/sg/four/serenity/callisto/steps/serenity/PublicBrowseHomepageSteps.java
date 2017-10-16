package sg.four.serenity.callisto.steps.serenity;

import com.gargoylesoftware.htmlunit.WebAssert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import sg.four.serenity.callisto.pages.HomePage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class PublicBrowseHomepageSteps extends ScenarioSteps {

    HomePage home;

    @Step
    public void goes_to_home() { home.open(); }

    @Step
    public void scrolls_to_section(String sectionName) {
        System.out.println("==> " + sectionName);
        assertThat(home.scrolls_to_section(sectionName), is(true));
    }

    @Step
    public void sees_main_nav_bar() {
        assertThat(home.scrolls_to_section("header__bottom"), is(true));
        List<String> list = home.getMainNavItems();
        System.out.println("==> Advance For Loop Example..");
        boolean ok = true;
        for (String temp : list) {
            System.out.println(temp);
            if(temp.equalsIgnoreCase("About") || temp.equalsIgnoreCase("Workplace") || temp.equalsIgnoreCase("Schools") || temp.equalsIgnoreCase("Community") || temp.equalsIgnoreCase("Healthy Living") || temp.equalsIgnoreCase("Partnerships"))
                continue;
            else
                ok = false;
        }
        assertThat(ok, is(true));
    }

    @Step
    public void sees_testimonials() {
        assertThat(home.getTestimonial(), is(true));
    }
}