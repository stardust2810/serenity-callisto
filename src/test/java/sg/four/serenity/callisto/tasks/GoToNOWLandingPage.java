package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.Home;
import sg.four.serenity.callisto.ui.NOWLandingPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToNOWLandingPage implements Task{
    NOWLandingPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static GoToNOWLandingPage open() {
        return instrumented(GoToNOWLandingPage.class);
    }
}
