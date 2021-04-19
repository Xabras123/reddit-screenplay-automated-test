package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.EntersActivityPosts;
import tasks.Login;
import tasks.SaveFeedPost;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT;

public class SavePostStepdefinitions {


    @Managed(driver = "chrome")
    private WebDriver browser;
    private HomePage homePage = new HomePage();
    private String savedPostTitle;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that (.*) enters with (.*) and (.*)")
    public void thatAccentureTestingEntersWithUserForUITestingAndCorreoPruebasTesting_(String actorName, String username, String password) {
        theActorCalled(actorName).can(BrowseTheWeb.with(browser));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));
        theActorInTheSpotlight().wasAbleTo(
                Login.withCredentials(username, password)
        );
    }

    @When("user wants to save the post number {int} from the home page")
    public void userWantsToSaveThePostNumberFromTheHomePage(int postPosition) {

        SaveFeedPost savedPost;
        theActorInTheSpotlight().wasAbleTo(
                savedPost = SaveFeedPost.inPosition(postPosition),
                EntersActivityPosts.inPosition(3)
        );
        savedPostTitle = savedPost.getPostTitle();
    }

    @Then("user expect for it to be saved on its saved post section")
    public void userExpectForItToBeSavedOnItsSavedPostSection() {

        theActorInTheSpotlight().should(seeThat(the(POST_TITLE_TEXT), WebElementStateMatchers.containsText(savedPostTitle)));

    }

    @After
    public void tearDown(){
        theActorInTheSpotlight().wasAbleTo(
                SaveFeedPost.inPosition(1)
        );
    }
}
