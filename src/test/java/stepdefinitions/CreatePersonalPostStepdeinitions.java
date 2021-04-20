package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import org.openqa.selenium.WebDriver;
import tasks.CreatePersonalPost;
import tasks.globaltasks.EnterProfilePage;
import tasks.globaltasks.SearchInPostFilter;

import java.util.Date;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_OPTIONS_BUTTONS;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT_IN_FEED;

public class CreatePersonalPostStepdeinitions {

    private String postName;
    private String imageName;

    @When("user wants to create a personal post with the message (.*) and an image in path (.*)")
    public void userWantsToCreateAPersonalPostWithTheMessageThisIsATestTitleAndAnImageCalledTestPng(String postTitle, String imagePath) {

        postName = postTitle + " - " + new Date();
        postTitle = postName;
        imageName = imagePath;
        WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();

        theActorInTheSpotlight().wasAbleTo(
                EnterProfilePage.fromMainPage(),
                CreatePersonalPost.byItsMainPage(postTitle, imagePath, driver)
        );
    }

    @Then("user expect for the post to be visible on the personal posts sections of the profile")
    public void userExpectForThePostToBeVisibleOnThePersonalPostsSectionsOfTheProfile() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*

        theActorInTheSpotlight().wasAbleTo(
                EnterProfilePage.fromMainPage()
        );

        */


        theActorInTheSpotlight().should(seeThat(the(POST_TITLE_TEXT), WebElementStateMatchers.containsText(postName + "")));

    }
}
