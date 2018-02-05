package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.RateThisSitePage;
import sg.four.serenity.callisto.ui.SitefinityDashboardPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSitefinityDashboardPage implements Task{
    SitefinityDashboardPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenSitefinityDashboardPage open() {
        return instrumented(OpenSitefinityDashboardPage.class);
    }
}
