package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/create_personal_post.feature",
        glue = "stepdefinitions",
        //tags = "@SuccessfulScenario",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreatePersonalPost {
}
