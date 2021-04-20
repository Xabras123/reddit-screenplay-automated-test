package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.openqa.selenium.WebDriver;
import tasks.globaltasks.SearchInPostFilter;
import tasks.joinsub.JoinSubreddit;
import tasks.joinsub.LeaveSubreddit;
import tasks.globaltasks.SearchInSearchBar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.*;

public class JoinSubredditStepdefinitions {

    private String joinedSubredditName;

    @When("user wants to join a subreddit named (.*)")
    public void userWantsToJoinASubredditNamedRInstagramreality(String subredditName) {

        JoinSubreddit joinSubreddit;
        theActorInTheSpotlight().wasAbleTo(
                SearchInSearchBar.forWord(subredditName),
                joinSubreddit = JoinSubreddit.byItsMainPage()
        );
        joinedSubredditName = joinSubreddit.getSubName();

    }

    @Then("user expect for the 'My Communities' section to have the new item")
    public void userExpectForTheSectionToHaveTheNewRInstagramrealityItem() {

        WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        driver.navigate().refresh();
        theActorInTheSpotlight().wasAbleTo(
                SearchInPostFilter.forWord(joinedSubredditName)
        );
        theActorInTheSpotlight().should(seeThat(the(MY_COMMUNITIES_OPTIONS_BUTTONS), WebElementStateMatchers.containsText(joinedSubredditName + "")));

    }


    @After("@JoinSub")
    public void tearDown(){


        theActorInTheSpotlight().wasAbleTo(
                LeaveSubreddit.byItsMainPage()
        );
    }

}
