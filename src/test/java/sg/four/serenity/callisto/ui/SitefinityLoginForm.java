package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityLoginForm {
    public static Target NAME = Target.the("name").located(By.cssSelector("input[name='wrap_name']"));
    public static Target PASSWORD = Target.the("password").located(By.cssSelector("input[name='wrap_password']"));
    public static Target LOGIN_BUTTON = Target.the("login").located(By.cssSelector("input[name='commit'][type='submit']"));
}
