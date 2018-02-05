package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

@DefaultUrl("https://beta-uat-m2.hpb.gov.sg/Sitefinity/dashboard")
public class SitefinityDashboardPage extends PageObject {

    private static Logger log = LogManager.getLogger(SitefinityDashboardPage.class);
}
