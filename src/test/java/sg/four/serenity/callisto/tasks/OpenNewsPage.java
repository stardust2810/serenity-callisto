package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.NewsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenNewsPage implements Task{
    NewsPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenNewsPage open() {
        return instrumented(OpenNewsPage.class);
    }
}
