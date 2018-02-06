package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityOTPForm {
    public static Target MODE_DROPDOWN = Target.the("mode dropdown").locatedBy("#otpMode");
    public static Target OTP_BUTTON = Target.the("login").located(By.cssSelector("input[name='request'][type='submit']"));
    public static Target OTP_TEXTFIELD = Target.the("opt textfield").located(By.cssSelector("input[name='token'][type='password']"));
    public static Target VERIFY_BUTTON = Target.the("verify").located(By.cssSelector("input[name='verify'][type='submit']"));
}

