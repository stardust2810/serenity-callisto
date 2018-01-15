package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import sg.four.serenity.callisto.ui.FAQSearchForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoASearchinFAQ implements Task {
    private final String phrase;

    protected DoASearchinFAQ(String phrase){
        this.phrase = phrase;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(phrase).into(FAQSearchForm.SEARCH_FIELD).thenHit(Keys.ENTER));
        //actor.attemptsTo(Click.on(FAQSearchForm.SEARCH_BUTTON));
    }

    public static DoASearchinFAQ enterSearch(String phrase){ return instrumented(DoASearchinFAQ.class, phrase);
    }
}
