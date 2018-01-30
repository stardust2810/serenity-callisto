package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.CommunityPage;
import sg.four.serenity.callisto.ui.HealthyLivingPage;

@Subject("Show about intro text")
public class HealthyLivingPageResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HealthyLivingPage.INTRO_TEXT)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new HealthyLivingPageResults();
    }
}
