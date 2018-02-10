package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityMainMenu {
    public static Target PAGE = Target.the("name").located(By.linkText("Pages"));
    //public static Target CREATE_A_PAGE = Target.the("create a page button").located(By.id("ctl04_frontendPagesListView_ctl00_ctl00_toolbar_createPageWidget_ctl00_ctl00_buttonText"));
    public static Target CREATE_A_PAGE = Target.the("create a page button").located(By.className("sfLinkBtnIn"));

    //public static Target CREATE_PAGE_NAME_FIELD = Target.the("name").located(By.id("contentViewInsertDialog_ctl00_ctl00_contentView_frontendPagesCreate_ctl00_ctl00_sections_mainSection_0_ctl00_0_ctl00_0_fields_0_PagesNameFieldControl_0_ctl00_0_ctl00_0_textBox_write_0"));
    //public static Target CREATE_PAGE_RETURN_BUTTON = Target.the("create and return to pages button").located(By.id("contentViewInsertDialog_ctl00_ctl00_contentView_frontendPagesCreate_ctl00_ctl00_ctl00_createAndReturnWidgetElement_ctl00_ctl00_buttonText"));
    public static Target CREATE_PAGE_NAME_FIELD = Target.the("name").located(By.cssSelector("input[name='contentViewInsertDialog$ctl00$ctl00$contentView$frontendPagesCreate$ctl00$ctl00$sections$ctl00$mainSection$ctl00$ctl00$fields$ctl01$PagesNameFieldControl$ctl00$ctl00$textBox_write'][class='sfTxt']"));
    public static Target CREATE_PAGE_RETURN_BUTTON = Target.the("create and return to pages button").located(By.linkText("Create and return to Pages"));
}
