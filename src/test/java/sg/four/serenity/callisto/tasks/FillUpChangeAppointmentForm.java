package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sg.four.serenity.callisto.ui.ChangeAppointmentPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUpChangeAppointmentForm implements Task {
    private final String name;
    private final String nric;
    private final String email;

    private static Logger log = LogManager.getLogger(FillUpChangeAppointmentForm.class);

    protected FillUpChangeAppointmentForm(String name, String nric, String email) {
        this.name = name;
        this.nric = nric;
        this.email = email;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new ScrollToTarget(ChangeAppointmentPage.NAME_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(name, ChangeAppointmentPage.NAME_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(ChangeAppointmentPage.NRIC_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(nric, ChangeAppointmentPage.NRIC_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(ChangeAppointmentPage.CLINIC_DROPDOWN));
        actor.attemptsTo(SelectFromOptions.byVisibleText("Student Health Clinic").from(ChangeAppointmentPage.CLINIC_DROPDOWN));
        actor.attemptsTo(new ScrollToTarget(ChangeAppointmentPage.EMAIL_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(email, ChangeAppointmentPage.EMAIL_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(ChangeAppointmentPage.SUBMIT_BUTTON));
        actor.attemptsTo(new ClickOnTarget(ChangeAppointmentPage.SUBMIT_BUTTON));
    }

    public static FillUpChangeAppointmentForm entersDetails(String name, String nric, String email){
        return instrumented(FillUpChangeAppointmentForm.class, name, nric, email);
    }
}
