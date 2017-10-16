package sg.four.serenity.callisto.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.*;
;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.hpb.gov.sg")
public class HomePage extends PageObject {

    @FindBy(className="nav__listing")
    private WebElementFacade mainNav;

    public void enter_search(String actionName) {
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
        WebElement searchField = getDriver().findElement(By.id("siteSearch"));
        searchField.sendKeys(actionName);
        searchField.sendKeys(Keys.ENTER);
    }

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

    public List<String> getMainNavItems() {
        return mainNav.findElements(By.className("nav__link")).stream().map( element -> element.getText() ).collect(Collectors.toList());
    }

    public boolean getTestimonial() {
        try {
            WebElement section = getDriver().findElement(By.className("testimonialls"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    /*
    public boolean scrolls_to_section(String tabName) {
        try {
            WebElement tab = getDriver().findElement(By.id(tabName));
            WebElement tab2 = getDriver().findElement(By.className("home-first-section"));
            WebDriver driver = getDriver();
                if (driver instanceof JavascriptExecutor) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab2);
                }
            return true;
        } catch(Exception e){
            return false;
        }
    }
     */
}