package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

@DefaultUrl("https://www.hpb.gov.sg/schools/medical-appointments/medical-appointment")
public class NewMedicalAppointmentPage extends PageObject {
    private static Logger log = LogManager.getLogger(NewMedicalAppointmentPage.class);
    public static Target NAME_TEXTBOX = Target.the("name textbox").locatedBy("#Textbox-1");
    public static Target NRIC_TEXTBOX = Target.the("nric textbox").locatedBy("#Textbox-2");
    public static Target DOB_TEXTBOX = Target.the("dob textbox").locatedBy("#Textbox-3");
    public static Target HOMENO_TEXTBOX = Target.the("homeno textbox").locatedBy("#Textbox-4");
    public static Target REASON_TEXTBOX = Target.the("reason textbox").locatedBy("#Textbox-7");
    public static Target EMAIL_TEXTBOX = Target.the("email textbox").locatedBy("#Textbox-8");
    public static Target GENDER_RADIO = Target.the("gender radio").located(By.cssSelector("input[name='MultipleChoiceFieldController'][value='Male']"));
    public static Target CITIZENSHIP_RADIO = Target.the("citizenship radio").located(By.cssSelector("input[name='MultipleChoiceFieldController_0'][value='Singaporean']"));
    public static Target RACE_RADIO = Target.the("race radio").located(By.cssSelector("input[name='MultipleChoiceFieldController_1'][value='Chinese']"));
    public static Target CLINIC_RADIO = Target.the("clinic radio").located(By.cssSelector("input[name='MultipleChoiceFieldController_2'][value='Immunisation']"));
    public static Target DAY_RADIO = Target.the("day radio").located(By.cssSelector("input[name='MultipleChoiceFieldController_3'][value='Mon']"));
    public static Target SESSION_RADIO = Target.the("session radio").located(By.cssSelector("input[name='MultipleChoiceFieldController_4'][value='PM']"));
    public static Target SUBMIT_BUTTON = Target.the("submit button").locatedBy(".sf-fieldWrp button");
    public static Target THANKYOU_TEXT = Target.the("thank you text").locatedBy("#Main_TFB312D76001_Col01");
}
