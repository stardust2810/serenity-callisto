package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sg.four.serenity.callisto.ui.FeedbackForm;
import sg.four.serenity.callisto.ui.RateThisSitePage;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.SitefinityOTPForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillUpSitefinityLoginForm implements Task {
    private final String name;
    private final String password;
    private static Logger log = LogManager.getLogger(FillUpSitefinityLoginForm.class);

    protected FillUpSitefinityLoginForm(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.NAME));
        actor.attemptsTo(new EnterValueIntoTarget(name, SitefinityLoginForm.NAME));
        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.PASSWORD));
        actor.attemptsTo(new EnterValueIntoTarget(password, SitefinityLoginForm.PASSWORD));
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);

        //Wait until text box has value greater or equal 12 character
        try {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    log.debug("========================================================================");
                    log.debug("Length:" + Text.of(SitefinityLoginForm.PASSWORD).viewedBy(actor).asString());
                    return (Text.of(SitefinityLoginForm.PASSWORD).viewedBy(actor).asString().length() >= 12);
                }
            });
        } catch (Exception e) {
            log.error(e);
        }
        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.LOGIN_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityLoginForm.LOGIN_BUTTON));

        //OTP Page
        actor.attemptsTo(new ScrollToTarget(SitefinityOTPForm.MODE_DROPDOWN));
        actor.attemptsTo(SelectFromOptions.byValue("email").from(SitefinityOTPForm.MODE_DROPDOWN));
        actor.attemptsTo(new ScrollToTarget(SitefinityOTPForm.OTP_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityOTPForm.OTP_BUTTON));

        //Wait until text box has value greater or equal 6 character
        try {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    log.debug("========================================================================");
                    log.debug("Length:" + Text.of(SitefinityOTPForm.OTP_TEXTFIELD).viewedBy(actor).asString());
                    return (Text.of(SitefinityOTPForm.OTP_TEXTFIELD).viewedBy(actor).asString().length() >= 6);
                }
            });
        } catch (Exception e) {
            log.error(e);
        }

        actor.attemptsTo(new ScrollToTarget(SitefinityOTPForm.VERIFY_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityOTPForm.VERIFY_BUTTON));
    }

    public static FillUpSitefinityLoginForm entersDetails(String name, String password){
        return instrumented(FillUpSitefinityLoginForm.class, name, password);
    }
}
