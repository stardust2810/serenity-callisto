package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@DefaultUrl("https://www.hpb.gov.sg/community")
public class CommunityPage extends PageObject {

    private static Logger log = LogManager.getLogger(CommunityPage.class);
    public static Target INTRO_TEXT = Target.the("intro text").locatedBy(".rte");
}
