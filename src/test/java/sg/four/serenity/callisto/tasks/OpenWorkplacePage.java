package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.AboutPage;
import sg.four.serenity.callisto.ui.WorkplacePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWorkplacePage implements Task{
    WorkplacePage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenWorkplacePage open() {
        return instrumented(OpenWorkplacePage.class);
    }
}
