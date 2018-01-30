package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.NOWLandingPage;

import java.util.List;

@Subject("tabs shown in the landing page")
public class HealthyLivingArticleListResults implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(NOWLandingPage.CARD_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> cards_shown(){
        return new HealthyLivingArticleListResults();
    }
}
