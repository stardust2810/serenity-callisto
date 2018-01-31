package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sg.four.serenity.callisto.ui.NewsPage;

import java.util.List;

@Subject("news cards shown in the news section")
public class NewsArticleListResults implements Question<List<String>> {

    private static Logger log = LogManager.getLogger(NewsArticleListResults.class);

    @Override
    public List<String> answeredBy(Actor actor) {
        /*
        //for debugging purposes

        List<String> a = Text.of(NewsPage.CARD_ITEMS).viewedBy(actor).asList();

        if (a == null) log.error("a is null");
        else log.info("a is not null");

        if(a.isEmpty())log.error("a is empty");
        else log.info("Size is " + a.size());
        */

        return Text.of(NewsPage.CARD_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> cards_shown(){
        return new NewsArticleListResults();
    }
}
