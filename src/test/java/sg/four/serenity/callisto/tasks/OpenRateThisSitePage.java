package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.FeedbackPage;
import sg.four.serenity.callisto.ui.RateThisSitePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenRateThisSitePage implements Task{
    RateThisSitePage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenRateThisSitePage open() {
        return instrumented(OpenRateThisSitePage.class);
    }
}
