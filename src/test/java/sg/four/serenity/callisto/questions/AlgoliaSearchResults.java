package sg.four.serenity.callisto.questions;

import sg.four.serenity.callisto.ui.AlgoliaSearchForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("Show search results")
public class AlgoliaSearchResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AlgoliaSearchForm.SEARCH_INTRO_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new AlgoliaSearchResults();
    }
}
