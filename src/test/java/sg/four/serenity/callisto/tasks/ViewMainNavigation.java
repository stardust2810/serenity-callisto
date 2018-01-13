package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import sg.four.serenity.callisto.ui.AlgoliaSearchForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewMainNavigation implements Task {
    private final String phrase;

    protected ViewMainNavigation(String phrase){
        this.phrase = phrase;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(phrase).into(AlgoliaSearchForm.SEARCH_FIELD).thenHit(Keys.ENTER));
        //actor.attemptsTo(Click.on(AlgoliaSearchForm.SEARCH_BUTTON));
    }

    public static ViewMainNavigation enterSearch(String phrase){
        return instrumented(ViewMainNavigation.class, phrase);
    }
}
