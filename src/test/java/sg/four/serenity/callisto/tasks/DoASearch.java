package sg.four.serenity.callisto.tasks;

import org.openqa.selenium.Keys;
import sg.four.serenity.callisto.ui.AlgoliaSearchForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoASearch implements Task {
    private final String phrase;

    protected DoASearch(String phrase){
        this.phrase = phrase;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(phrase).into(AlgoliaSearchForm.SEARCH_FIELD).thenHit(Keys.ENTER));
        //actor.attemptsTo(Click.on(AlgoliaSearchForm.SEARCH_BUTTON));
    }

    public static DoASearch enterSearch(String phrase){
        return instrumented(DoASearch.class, phrase);
    }
}
