package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

@DefaultUrl("http://site17567204059862.srv05.sandbox.sitefinity.com/sitefinity")
public class SitefinityCloudDashboardPage extends PageObject {

    private static Logger log = LogManager.getLogger(SitefinityCloudDashboardPage.class);
    public static Target NAME = Target.the("name").locatedBy("#username");
    public static Target PASSWORD = Target.the("password").locatedBy("password");
    public static Target LOGIN_BUTTON = Target.the("login").locatedBy("loginButton");
}
