package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.targets.Target;

public class OpenHomePage implements Task{
    Home page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenHomePage loads_home() {
        return instrumented(OpenHomePage.class);
    }
}
