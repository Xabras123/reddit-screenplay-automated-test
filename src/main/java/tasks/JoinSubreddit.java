package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.SEARCH_BAR;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.SEARCH_SUGGESTIONS;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT;
import static userinterfaces.globalcomponents.subreddit.SubHeader.JOIN_SUBREDDIT_BUTTON;
import static userinterfaces.globalcomponents.subreddit.SubHeader.SUBREDDIT_NAME;

public class JoinSubreddit implements Task {


    private String subredditName;

    public JoinSubreddit() {
        this.subredditName = new String();
    }

    public static JoinSubreddit byItsMainPage(){
        return instrumented(JoinSubreddit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(JOIN_SUBREDDIT_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(JOIN_SUBREDDIT_BUTTON)

        );

        subredditName = SUBREDDIT_NAME.resolveFor(actor).getText();


    }


    public String getSubName() {
        return subredditName;
    }
}
