package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.tasks.FillUpSitefinityLoginForm;
import sg.four.serenity.callisto.ui.RateThisSitePage;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;

@Subject("Show feedback form submission results")
public class LoginFormFailureResults implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SitefinityLoginForm.ERROR_MESSAAGE)
                .viewedBy(actor)
                .asString();
    }

    public static Question<String> text(){
        return new LoginFormFailureResults();
    }
}
