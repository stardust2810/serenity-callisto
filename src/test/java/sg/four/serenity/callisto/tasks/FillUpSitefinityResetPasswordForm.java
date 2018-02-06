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
import sg.four.serenity.callisto.ui.SitefinityLoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillUpSitefinityResetPasswordForm implements Task {
    private final String name;
    private static Logger log = LogManager.getLogger(FillUpSitefinityResetPasswordForm.class);

    protected FillUpSitefinityResetPasswordForm(String name) {
        this.name = name;
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.NAME));
        actor.attemptsTo(new EnterValueIntoTarget(name, SitefinityLoginForm.NAME));

        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.LOGIN_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityLoginForm.LOGIN_BUTTON));

    }

    public static FillUpSitefinityResetPasswordForm entersDetails(String name){
        return instrumented(FillUpSitefinityResetPasswordForm.class, name);
    }
}
