package sg.four.serenity.callisto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import sg.four.serenity.callisto.ui.SitefinityCreateAPage;
import sg.four.serenity.callisto.ui.SitefinityLoginForm;
import sg.four.serenity.callisto.ui.SitefinityMainMenu;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CreateNewPage implements Task {
    private final String name = null;
    private final String password = null;
    private static Logger log = LogManager.getLogger(CreateNewPage.class);

    protected CreateNewPage() {
    }

    public <T extends Actor> void performAs(T actor) {
        log.info("1 =======================================================");
        log.info("2 =======================================================");
        log.info(getDriver().getCurrentUrl() + " | " + getDriver().getTitle() + " | " + getDriver().getWindowHandle());
        log.info("3 =======================================================");

        actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.PAGE));
        actor.attemptsTo(new ClickOnTarget(SitefinityMainMenu.PAGE));

        log.info("4 =======================================================");

        //wait for the new page to load
        actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.CREATE_A_PAGE));
        log.info("5 =======================================================");
        actor.attemptsTo(new ClickOnTarget(SitefinityMainMenu.CREATE_A_PAGE));
        log.info("6 =======================================================");

        WebDriverWait wait = new WebDriverWait(getDriver(), 100);
        //enter the name

        /*
        try {
            FluentWait<WebDriver> fluentWait = new FluentWait<>(getDriver())
                    .withTimeout(30, TimeUnit.SECONDS)
                    .pollingEvery(200, TimeUnit.MILLISECONDS)
                    .ignoring(NoSuchElementException.class);
        } catch (Exception e){
            log.error(e);
        }
        */
        log.info("7 =======================================================");
        log.info(getDriver().getCurrentUrl() + " | " + getDriver().getTitle() + " | " + getDriver().getWindowHandle());
        log.info("8 =======================================================");
        Set<String> handles = getDriver().getWindowHandles();
        for (String s: handles) {
            log.debug(s);
        }
        log.info("9 =======================================================");
        log.info("10 =======================================================");
/*
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#contentViewInsertDialog_ctl00_ctl00_contentView_frontendPagesCreate_ctl00_ctl00_sections_mainSection_0_ctl00_0_ctl00_0_fields_0_PagesNameFieldControl_0_ctl00_0_ctl00_0_textBox_write_0")));
            //WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(SitefinityMainMenu.CREATE_PAGE_NAME_FIELD.getCssOrXPathSelector())));
        } catch (Exception e) {
            log.info("10 ERROR =======================================================");
            log.error(e);
        }
*/

        //WebDriverWait wait = new WebDriverWait(driver, 100);
        //element= wait.until(ExpectedConditions.elementToBeClickable(By.id("usrUtils")));
        
        try {
            actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.CREATE_PAGE_NAME_FIELD));
            log.info("11 =======================================================");
            actor.attemptsTo(new EnterValueIntoTarget("Automated Test Page", SitefinityMainMenu.CREATE_PAGE_NAME_FIELD));
        } catch (Exception e) {
            log.info("11 ERROR ======================================================= [Start]");
            log.error(e);
            log.info("11 ERROR ======================================================= [End]");
        }

        //clicks on the create button
        log.info("12 =======================================================");
        actor.attemptsTo(new ScrollToTarget(SitefinityMainMenu.CREATE_PAGE_RETURN_BUTTON));
        log.info("13 =======================================================");
        actor.attemptsTo(new ClickOnTarget(SitefinityMainMenu.CREATE_PAGE_RETURN_BUTTON));
        log.info("14 =======================================================");
    }

    public static CreateNewPage createAPage(){
        return instrumented(CreateNewPage.class);
    }
}
