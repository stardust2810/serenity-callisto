package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityCreateAPage {
    public static Target NAME = Target.the("name").located(By.id("contentViewInsertDialog_ctl00_ctl00_contentView_frontendPagesCreate_ctl00_ctl00_sections_mainSection_0_ctl00_0_ctl00_0_fields_0_PagesNameFieldControl_0_ctl00_0_ctl00_0_textBox_write_0"));
    public static Target CREATE_AND_ADD_BUTTON = Target.the("create and add content button").located(By.id("contentViewInsertDialog_ctl00_ctl00_contentView_frontendPagesCreate_ctl00_ctl00_ctl00_saveChangesWidgetElement_ctl00_ctl00_buttonText"));
}
