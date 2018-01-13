package sg.four.serenity.callisto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import sg.four.serenity.callisto.ui.MainNavigationMenu;

import java.util.List;

@Subject("Show search results")
public class MainMenuItemResults implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(MainNavigationMenu.MAIN_MENU_ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> menu_items_shown(){
        return new MainMenuItemResults();
    }
}
