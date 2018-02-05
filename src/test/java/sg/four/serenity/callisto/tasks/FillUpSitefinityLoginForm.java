package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sg.four.serenity.callisto.ui.RateThisSitePage;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;
import net.serenitybdd.screenplay.questions.Text;

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
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);

//Wait until text box has value greater or equal 5 character
        try {
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    log.debug("========================================================================");
                    log.debug("Length:" + Text.of(SitefinityLoginForm.PASSWORD).viewedBy(actor).asString());
                    return (Text.of(SitefinityLoginForm.PASSWORD).viewedBy(actor).asString().length() >= 18);
                }
            });
        } catch (Exception e) {
            log.error(e);
        }
        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.LOGIN_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityLoginForm.LOGIN_BUTTON));

    }

    public static FillUpSitefinityLoginForm entersDetails(String name, String password){
        return instrumented(FillUpSitefinityLoginForm.class, name, password);
    }
}
