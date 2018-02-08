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
import sg.four.serenity.callisto.ui.SitefinityCreateAPage;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;
import sg.four.serenity.callisto.ui.SitefinityMainMenu;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CreateNewPage implements Task {
    private final String name = null;
    private final String password = null;
    private static Logger log = LogManager.getLogger(CreateNewPage.class);

    protected CreateNewPage() {
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.PAGE));
        actor.attemptsTo(new ClickOnTarget(SitefinityMainMenu.PAGE));

        //wait for the new page to load
        actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.CREATE_A_PAGE));
        actor.attemptsTo(new ClickOnTarget(SitefinityMainMenu.CREATE_A_PAGE));

        //enter the name
        actor.attemptsTo(new ScrollToTarget(SitefinityCreateAPage.NAME));
        actor.attemptsTo(new EnterValueIntoTarget("Automated Test Page", SitefinityCreateAPage.NAME));

        //clicks on the create button
        actor.attemptsTo(new ScrollToTarget(SitefinityCreateAPage.CREATE_AND_ADD_BUTTON));
        actor.attemptsTo(new ClickOnTarget(SitefinityCreateAPage.CREATE_AND_ADD_BUTTON));
    }

    public static CreateNewPage createAPage(){
        return instrumented(CreateNewPage.class);
    }
}
