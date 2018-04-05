package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.PartnershipPage;

import java.util.List;

@Subject("tabs shown in the landing page")
public class PartnershipArticleListResults implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(PartnershipPage.CARD_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> cards_shown(){
        return new PartnershipArticleListResults();
    }
}
