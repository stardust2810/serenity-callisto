package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.FAQSearchForm;

@Subject("Show search results")
public class FAQSearchResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FAQSearchForm.FAQ_PROGRAMME)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new FAQSearchResults();
    }
}
