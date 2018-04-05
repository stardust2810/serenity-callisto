package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.NewMedicalAppointmentPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenNewMedicalAppointmentPage implements Task{
    NewMedicalAppointmentPage page;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(page)
        );
    }

    public static OpenNewMedicalAppointmentPage open() {
        return instrumented(OpenNewMedicalAppointmentPage.class);
    }
}
