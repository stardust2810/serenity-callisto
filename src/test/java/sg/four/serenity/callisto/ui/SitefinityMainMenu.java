package sg.four.serenity.callisto.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SitefinityMainMenu {
    public static Target PAGE = Target.the("name").located(By.linkText("Pages"));
    //public static Target CREATE_A_PAGE = Target.the("create a page button").located(By.id("ctl04_frontendPagesListView_ctl00_ctl00_toolbar_createPageWidget_ctl00_ctl00_buttonText"));
    public static Target CREATE_A_PAGE = Target.the("create a page button").located(By.className("sfLinkBtnIn"));
}
