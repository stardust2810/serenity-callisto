package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.CommunityPage;
import sg.four.serenity.callisto.ui.SchoolsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCommunityPage implements Task{
    CommunityPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenCommunityPage open() {
        return instrumented(OpenCommunityPage.class);
    }
}
