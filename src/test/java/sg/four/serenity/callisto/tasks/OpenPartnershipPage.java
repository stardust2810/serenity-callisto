package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.HealthyLivingPage;
import sg.four.serenity.callisto.ui.PartnershipPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPartnershipPage implements Task{
    PartnershipPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenPartnershipPage open() {
        return instrumented(OpenPartnershipPage.class);
    }
}
