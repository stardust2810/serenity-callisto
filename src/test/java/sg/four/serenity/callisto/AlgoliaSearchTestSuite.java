package sg.four.serenity.callisto;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/search_for_information/AlgoliaSearch.feature")
public class AlgoliaSearchTestSuite {}
