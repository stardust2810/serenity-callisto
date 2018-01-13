package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AlgoliaSearchForm {
    public static Target SEARCH_FIELD = Target.the("search field").locatedBy("#siteSearch");
    public static Target SEARCH_BUTTON = Target.the("search button").locatedBy(".btn-search");
    public static Target SEARCH_INTRO_TEXT = Target.the("search intro text").locatedBy(".rte h3");
}
