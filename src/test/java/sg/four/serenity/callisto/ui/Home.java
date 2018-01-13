package sg.four.serenity.callisto.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

import java.util.List;
import java.util.stream.Collectors;

import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.hpb.gov.sg")
public class Home extends PageObject {

    private static Logger log = LogManager.getLogger(Home.class);
    //public static Target MENU_ABOUT = Target.the("menu about").locatedBy("/html/body/form[1]/header/div[3]/nav/div/ul/li[2]/a");

    public boolean scrolls_to_section(String sectionName) {
        try {
            WebDriver driver = getDriver();
            WebElement section = driver.findElement(By.className(sectionName));
            if (driver instanceof JavascriptExecutor) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }
}