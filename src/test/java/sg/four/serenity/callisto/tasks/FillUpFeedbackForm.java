package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;
import sg.four.serenity.callisto.ui.FeedbackForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUpFeedbackForm implements Task {
    private final String category;
    private final String details;
    private final String email;
    private final String name;


    protected FillUpFeedbackForm(String category, String details, String email, String name) {
        this.category = category;
        this.details = details;
        this.email = email;
        this.name = name;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(category).into(FeedbackForm.CATEGORY_DROPDOWN).thenHit(Keys.ENTER));
        actor.attemptsTo(Enter.theValue(details).into(FeedbackForm.DETAILS_TEXTAREA).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(email).into(FeedbackForm.EMAIL_TEXTFIELD).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(name).into(FeedbackForm.NAME_TEXTFIELD).thenHit(Keys.TAB));
        actor.attemptsTo(Click.on(FeedbackForm.SUBMIT_BUTTON));
    }

    public static FillUpFeedbackForm entersDetails(String category, String details, String email, String name){
        return instrumented(FillUpFeedbackForm.class, category, details, email, name);
    }
}
