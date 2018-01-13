package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import sg.four.serenity.callisto.ui.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToSection implements Performable {

    private final String section_name;
    Home page;

    protected ScrollToSection(String section_name){
        this.section_name = section_name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        page.scrolls_to_section(section_name);
    }

    public static ScrollToSection called(String section_name) {
        return instrumented(ScrollToSection.class, section_name);
    }
}
