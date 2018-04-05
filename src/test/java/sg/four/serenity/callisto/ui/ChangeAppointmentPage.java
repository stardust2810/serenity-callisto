package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

@DefaultUrl("https://www.hpb.gov.sg/schools/medical-appointments/change-of-medical-appointment")
public class ChangeAppointmentPage extends PageObject {
    private static Logger log = LogManager.getLogger(ChangeAppointmentPage.class);

    //mandatory fields
    public static Target NAME_TEXTBOX = Target.the("name textbox").locatedBy("#Textbox-1");
    public static Target NRIC_TEXTBOX = Target.the("nric textbox").locatedBy("#Textbox-2");
    public static Target CLINIC_DROPDOWN = Target.the("clinic dropdown").locatedBy("#Dropdown-1");
    public static Target EMAIL_TEXTBOX = Target.the("email textbox").locatedBy("#Textbox-13");

    //optional fields
    /*
    public static Target SERVICES_RADIO = Target.the("services radio").located(By.cssSelector("input[name='MultipleChoiceFieldController'][value='Endocrine Clinic']"));
    public static Target DATE_TEXTBOX = Target.the("date textbox").locatedBy("#Textbox-3");
    public static Target TIME_TEXTBOX = Target.the("time textbox").locatedBy("#Textbox-4");
    public static Target DATE1_TEXTBOX = Target.the("date1 textbox").locatedBy("#Textbox-5");
    public static Target TIME1_TEXTBOX = Target.the("time1 textbox").locatedBy("#Textbox-6");
    public static Target NAME1_TEXTBOX = Target.the("name1 textbox").locatedBy("#Textbox-7");
    public static Target NRIC1_TEXTBOX = Target.the("nric1 textbox").locatedBy("#Textbox-8);
    */

    public static Target SUBMIT_BUTTON = Target.the("submit button").locatedBy(".sf-fieldWrp button");
    public static Target THANKYOU_TEXT = Target.the("thank you text").locatedBy("#Main_TFB312D76001_Col01");
}
