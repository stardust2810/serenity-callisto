package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@DefaultUrl("https://www.hpb.gov.sg/schools")
public class SchoolsPage extends PageObject {

    private static Logger log = LogManager.getLogger(SchoolsPage.class);
    //public static Target CARD_ITEMS = Target.the("list of cards").locatedBy(".link-card__title");
}
