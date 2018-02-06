package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;

@Subject("Show feedback form submission results")
public class SitefinityResetPasswordResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SitefinityLoginForm.RESET_SUCCESS)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new SitefinityResetPasswordResults();
    }
}
