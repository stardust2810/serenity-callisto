package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.UsefulInfoTab;

import java.util.List;

@Subject("tabs shown in the landing page")
public class UsefulInfoTabItemResults implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(UsefulInfoTab.TAB_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> tabs_shown(){
        return new UsefulInfoTabItemResults();
    }
}
