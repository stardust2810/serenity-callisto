package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FeedbackForm {
    public static Target CATEGORY_DROPDOWN = Target.the("category dropdown").locatedBy("#Dropdown-1");
    public static Target DETAILS_TEXTAREA = Target.the("details textarea").locatedBy("#Textarea-1");
    public static Target EMAIL_TEXTFIELD = Target.the("email textfield").locatedBy("#Textbox-1");
    public static Target NAME_TEXTFIELD = Target.the("name textfield").locatedBy("#Textbox-2");
    public static Target SUBMIT_BUTTON = Target.the("submit button").locatedBy(".sf-fieldWrp button");
    public static Target THANKYOU_TEXT = Target.the("thank you text").locatedBy("#Main_TFB312D76001_Col01");
}
