package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.ChangeAppointmentPage;

@Subject("Show submission results for New Medical Appointment form")
public class ChangeAppointmentFormResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ChangeAppointmentPage.THANKYOU_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new ChangeAppointmentFormResults();
    }
}
