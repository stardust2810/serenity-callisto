package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.RateThisSitePage;

@Subject("Show feedback form submission results")
public class RateThisSiteFormResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RateThisSitePage.THANKYOU_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new RateThisSiteFormResults();
    }
}
