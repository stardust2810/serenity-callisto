package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.FeedbackForm;

@Subject("Show feedback form submission results")
public class FeedbackFormResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FeedbackForm.THANKYOU_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new FeedbackFormResults();
    }
}
