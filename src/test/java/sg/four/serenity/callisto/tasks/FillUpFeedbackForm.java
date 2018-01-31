package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import sg.four.serenity.callisto.ui.FeedbackForm;
import org.openqa.selenium.support.ui.Select;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUpFeedbackForm implements Task {
    private final String category;
    private final String details;
    private final String email;
    private final String name;
    private static Logger log = LogManager.getLogger(FillUpFeedbackForm.class);

    protected FillUpFeedbackForm(String category, String details, String email, String name) {
        this.category = category;
        this.details = details;
        this.email = email;
        this.name = name;
    }

    public <T extends Actor> void performAs(T actor) {

               /*
        //for debugging purposes

        List<String> a = Text.of(NewsPage.CARD_ITEMS).viewedBy(actor).asList();

        if (a == null) log.error("a is null");
        else log.info("a is not null");

        if(a.isEmpty())log.error("a is empty");
        else log.info("Size is " + a.size());
        */
               if(FeedbackForm.CATEGORY_DROPDOWN==null) log.error("Form is null");
               else {
                   log.info("Dropdown is found");
                   log.info(FeedbackForm.CATEGORY_DROPDOWN.getCssOrXPathSelector());
               }
               try {
Select a = new Select(FeedbackForm.CATEGORY_DROPDOWN.resolveFor(actor));
a.selectByValue("Suggestions");
                  // actor.attemptsTo(Enter.theValue(category).into(FeedbackForm.CATEGORY_DROPDOWN).thenHit(Keys.TAB));
                   //actor.attemptsTo(Enter.theValue(details).into(FeedbackForm.DETAILS_TEXTAREA).thenHit(Keys.TAB));
                   //actor.attemptsTo(Enter.theValue(email).into(FeedbackForm.EMAIL_TEXTFIELD).thenHit(Keys.TAB));
                   actor.attemptsTo(new EnterValueIntoTarget("testhotmail.com", FeedbackForm.EMAIL_TEXTFIELD));
                   //actor.attemptsTo(Enter.theValue(name).into(FeedbackForm.NAME_TEXTFIELD).thenHit(Keys.TAB));
                   //actor.attemptsTo(Click.on(FeedbackForm.SUBMIT_BUTTON));
               }catch (Exception e) {
                   log.error(e);
               }
    }

    public static FillUpFeedbackForm entersDetails(String category, String details, String email, String name){
        return instrumented(FillUpFeedbackForm.class, category, details, email, name);
    }
}
