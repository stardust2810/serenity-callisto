package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FAQSearchForm {
    public static Target SEARCH_FIELD = Target.the("search field").locatedBy(".search-bar__input");
    public static Target SEARCH_BUTTON = Target.the("search button").locatedBy(".search-bar__btn");
    public static Target SEARCH_CHOICE = Target.the("search intro text").locatedBy("search-choice");
    public static Target FAQ_PROGRAMME = Target.the("faq programme title").locatedBy(".faq-programme");
}
