package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityLoginForm {
    public static Target NAME = Target.the("name").located(By.cssSelector("input[name='wrap_name']"));
    public static Target PASSWORD = Target.the("password").located(By.cssSelector("input[name='wrap_password']"));
    public static Target LOGIN_BUTTON = Target.the("login").located(By.cssSelector("input[name='commit'][type='submit']"));
    public static Target ERROR_MESSAAGE = Target.the("error message").located(By.cssSelector(".field-validation-error"));
    public static Target FORGET_PASSWORD_LINK = Target.the("link for forget password").located(By.linkText("Forget Password"));
    public static Target RESET_SUCCESS = Target.the("success message for password reset").locatedBy(".success");
}

