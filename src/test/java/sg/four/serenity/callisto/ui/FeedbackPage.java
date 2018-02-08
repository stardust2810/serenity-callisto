package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.hpb.gov.sg/feedback")
//@DefaultUrl("https://beta-uat-m2.hpb.gov.sg/feedback")
public class FeedbackPage extends PageObject {

    @FindBy(id="Dropdown-1")
    WebElement formSection;

    private static Logger log = LogManager.getLogger(FeedbackPage.class);
}
