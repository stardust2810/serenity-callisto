package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sg.four.serenity.callisto.ui.RateThisSitePage;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillUpRateThisSiteForm implements Task {
    private final String q1;
    private final String q2;
    private final String q3;
    private final String comments;
    private final String name;
    private final String email;
    private static Logger log = LogManager.getLogger(FillUpRateThisSiteForm.class);

    protected FillUpRateThisSiteForm(String q1, String q2, String q3, String comments, String email, String name) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.comments = comments;
        this.email = email;
        this.name = name;
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.RADIO_Q1V6));
        actor.attemptsTo(new ClickOnTarget(RateThisSitePage.RADIO_Q1V6));
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.RADIO_Q2V5));
        actor.attemptsTo(new ClickOnTarget(RateThisSitePage.RADIO_Q2V5));
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.RADIO_Q3V6));
        actor.attemptsTo(new ClickOnTarget(RateThisSitePage.RADIO_Q3V6));
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.COMMENTS_TEXTAREA));
        actor.attemptsTo(new EnterValueIntoTarget("This is an automatic generated text", RateThisSitePage.COMMENTS_TEXTAREA));
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.NAME_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(actor.getName(), RateThisSitePage.NAME_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.EMAIL_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget("test@test.com", RateThisSitePage.EMAIL_TEXTBOX));
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);

//Wait until text box has value greater or equal 5 character
        try {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    log.debug("========================================================================");
                    log.debug("Length:" + RateThisSitePage.captcha.getText().length());
                    return (RateThisSitePage.captcha.getText().length() >= 5);
                }
            });
        } catch (Exception e) {
            log.error(e);
        }


        //BrowseTheWeb.as(actor).setImplicitTimeout(30, SECONDS);
        //BrowseTheWeb.as(actor).resetImplicitTimeout();
        actor.attemptsTo(new ScrollToTarget(RateThisSitePage.SUBMIT_BUTTON));
        actor.attemptsTo(new ClickOnTarget(RateThisSitePage.SUBMIT_BUTTON));
           /*
           actor.attemptsTo(SelectFromOptions.byValue("Suggestions").from(FeedbackForm.CATEGORY_DROPDOWN));
           actor.attemptsTo(new ScrollToTarget(FeedbackForm.DETAILS_TEXTAREA));
           actor.attemptsTo(new EnterValueIntoTarget("This is an automated test script", FeedbackForm.DETAILS_TEXTAREA));
           actor.attemptsTo(new ScrollToTarget(FeedbackForm.EMAIL_TEXTFIELD));
           actor.attemptsTo(new EnterValueIntoTarget("testhotmail.com", FeedbackForm.EMAIL_TEXTFIELD));
           actor.attemptsTo(new ScrollToTarget(FeedbackForm.NAME_TEXTFIELD));
           actor.attemptsTo(new EnterValueIntoTarget("Serenity", FeedbackForm.NAME_TEXTFIELD));
           actor.attemptsTo(new ScrollToTarget(FeedbackForm.SUBMIT_BUTTON));
           actor.attemptsTo(new ClickOnTarget(FeedbackForm.SUBMIT_BUTTON));
           */
    }

    public static FillUpRateThisSiteForm entersDetails(String q1, String q2, String q3, String comments, String email, String name){
        return instrumented(FillUpRateThisSiteForm.class, q1, q2, q3, comments, email, name);
    }
}
