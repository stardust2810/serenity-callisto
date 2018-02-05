package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.hpb.gov.sg/rate-this-site")
public class RateThisSitePage extends PageObject {

    @FindBy(id="Textbox-3")
    public static WebElementFacade captcha;

    private static Logger log = LogManager.getLogger(RateThisSitePage.class);
    public static Target RADIO_Q1V6 = Target.the("qns 1").located(By.cssSelector("input[name='MultipleChoiceFieldController'][value='6']"));
    public static Target RADIO_Q2V5 = Target.the("qns 2").located(By.cssSelector("input[name='MultipleChoiceFieldController_0'][value='5']"));
    public static Target RADIO_Q3V6 = Target.the("qns 3").located(By.cssSelector("input[name='MultipleChoiceFieldController_1'][value='6']"));
    public static Target COMMENTS_TEXTAREA = Target.the("comments textarea").locatedBy("#Textarea-1");
    public static Target NAME_TEXTBOX = Target.the("name textbox").locatedBy("#Textbox-1");
    public static Target EMAIL_TEXTBOX = Target.the("email textbox").locatedBy("#Textbox-2");
    public static Target SUBMIT_BUTTON = Target.the("submit button").locatedBy(".sf-fieldWrp button");
    public static Target THANKYOU_TEXT = Target.the("thank you text").locatedBy("#Main_TFB312D76001_Col01");
}
