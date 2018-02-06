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

public class SitefinityResetPassword implements Task {

    private static Logger log = LogManager.getLogger(SitefinityResetPassword.class);

    protected SitefinityResetPassword() {
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new ScrollToTarget(SitefinityLoginForm.FORGET_PASSWORD_LINK));
        actor.attemptsTo(new ClickOnTarget(SitefinityLoginForm.FORGET_PASSWORD_LINK));

    }

    public static SitefinityResetPassword resetPassword(){
        return instrumented(SitefinityResetPassword.class);
    }
}
