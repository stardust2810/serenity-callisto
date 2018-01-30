package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.AboutIntroText;
import sg.four.serenity.callisto.ui.SchoolsIntroText;

@Subject("Show about intro text")
public class SchoolsPageResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SchoolsIntroText.INTRO_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new SchoolsPageResults();
    }
}
