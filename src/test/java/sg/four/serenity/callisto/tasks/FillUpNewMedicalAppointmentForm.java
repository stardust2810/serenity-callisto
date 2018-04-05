package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sg.four.serenity.callisto.ui.NewMedicalAppointmentPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FillUpNewMedicalAppointmentForm implements Task {
    private final String name;
    private final String nric;
    private final String dob;
    private final String email;
    private final String homeno;
    private final String reasons;

    private static Logger log = LogManager.getLogger(FillUpNewMedicalAppointmentForm.class);

    protected FillUpNewMedicalAppointmentForm(String name, String nric, String dob, String email, String homeno, String reasons) {
        this.name = name;
        this.nric = nric;
        //02-04-2018
        this.dob = dob;
        this.email = email;
        this.homeno = homeno;
        this.reasons = reasons;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.NAME_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(name, NewMedicalAppointmentPage.NAME_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.NRIC_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(nric, NewMedicalAppointmentPage.NRIC_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.DOB_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(dob, NewMedicalAppointmentPage.DOB_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.GENDER_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.GENDER_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.CITIZENSHIP_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.CITIZENSHIP_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.RACE_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.RACE_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.HOMENO_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(homeno, NewMedicalAppointmentPage.HOMENO_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.REASON_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(reasons, NewMedicalAppointmentPage.REASON_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.EMAIL_TEXTBOX));
        actor.attemptsTo(new EnterValueIntoTarget(email, NewMedicalAppointmentPage.EMAIL_TEXTBOX));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.CLINIC_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.CLINIC_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.DAY_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.DAY_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.SESSION_RADIO));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.SESSION_RADIO));
        actor.attemptsTo(new ScrollToTarget(NewMedicalAppointmentPage.SUBMIT_BUTTON));
        actor.attemptsTo(new ClickOnTarget(NewMedicalAppointmentPage.SUBMIT_BUTTON));
    }

    public static FillUpNewMedicalAppointmentForm entersDetails(String name, String nric, String dob, String email, String homeno, String reasons){
        return instrumented(FillUpNewMedicalAppointmentForm.class, name, nric, dob, email, homeno, reasons);
    }
}
