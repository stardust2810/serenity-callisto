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
import sg.four.serenity.callisto.ui.SitefinityCloudDashboardPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillUpSitefinityCloudLoginForm implements Task {
    private final String name;
    private final String password;
    private static Logger log = LogManager.getLogger(FillUpSitefinityCloudLoginForm.class);

    protected FillUpSitefinityCloudLoginForm(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public <T extends Actor> void performAs(T actor) {
        SitefinityCloudDashboardPage.NAME.resolveFor(actor).waitUntilVisible();
        actor.attemptsTo(new ScrollToTarget(SitefinityCloudDashboardPage.NAME));
        actor.attemptsTo(new EnterValueIntoTarget(name, SitefinityCloudDashboardPage.NAME));
        actor.attemptsTo(new ScrollToTarget(SitefinityCloudDashboardPage.PASSWORD));
        actor.attemptsTo(new EnterValueIntoTarget(password, SitefinityCloudDashboardPage.PASSWORD));
        actor.attemptsTo(new ScrollToTarget(SitefinityCloudDashboardPage.LOGIN_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityCloudDashboardPage.LOGIN_BUTTON));
        //new WebDriverWait(getDriver(),10).until(SitefinityCloudDashboardPage.NAME.resolveFor(actor).isCurrentlyVisible());
    }

    public static FillUpSitefinityCloudLoginForm entersDetails(String name, String password){
        return instrumented(FillUpSitefinityCloudLoginForm.class, name, password);
    }
}
