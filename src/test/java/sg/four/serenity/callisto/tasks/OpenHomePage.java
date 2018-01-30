package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenHomePage implements Task{
    HomePage page;

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
