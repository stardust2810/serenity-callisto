package sg.four.serenity.callisto.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.hpb.gov.sg")
@NamedUrls(
    {
        @NamedUrl(name = "section", url = "https://www.hpb.gov.sg/{1}"),
        @NamedUrl(name = "about", url = "https://www.hpb.gov.sg/about/{1}"),
        @NamedUrl(name = "careers", url = "https://www.hpb.gov.sg/careers/{1}")

    }
)
public class SectionPage extends PageObject {

    private static Logger log = LogManager.getLogger(SectionPage.class);

    public String getWorkplaceIntroText() {
        //normal way to find web elements
        /*
         by id - WebElement todoField = getDriver().findElement(By.id("new-todo"));
         by classname - WebElement todoField = getDriver().findElement(By.className("new-todo"));
         by tag - WebElement todoField = getDriver().findElement(By.tagName("iframe"));
         Find the link element with matching visible text. eg. <a href="http://www.google.com/search?q=cheese">cheese</a>>
         WebElement todoField = getDriver().findElement(By.linkText("cheese"));
         by css selector, eg. <div id="food"><span class="dairy">milk</span><span class="dairy aged">cheese</span></div>
         WebElement todoField = getDriver().findElement(By.cssSelector("#food span.diary.aged"));
         get text - WebElement todoField = getDriver().findElement(By.cssSelector("#new-todo")).getText();
         */
        WebElement content = getDriver().findElement(By.cssSelector("#rte p"));
        log.info(content.getText());

        return content.getText();
    }
}