package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.hpb.gov.sg/feedback")
public class FeedbackPage extends PageObject {

    @FindBy(className="form-container")
    WebElement formSection;

    private static Logger log = LogManager.getLogger(Home.class);
    //public static Target CARD_ITEMS = Target.the("list of cards").locatedBy(".link-card__title");

    @WhenPageOpens
    public void waitUntilFormAppears() {
        element(formSection).waitUntilVisible();
    }
}