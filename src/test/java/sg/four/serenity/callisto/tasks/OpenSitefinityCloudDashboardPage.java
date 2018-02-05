package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.SitefinityCloudDashboardPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSitefinityCloudDashboardPage implements Task{
    SitefinityCloudDashboardPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
        
        actor.attemptsTo(FillUpSitefinityCloudLoginForm.entersDetails("site17567204059862", "PqIMOM7J"));
    }

    public static OpenSitefinityCloudDashboardPage open() {
        return instrumented(OpenSitefinityCloudDashboardPage.class);
    }
}
