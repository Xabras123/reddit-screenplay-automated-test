package tasks.joinsub;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.subreddit.SubHeader.*;

public class LeaveSubreddit implements Task {


    private String subredditName;

    public LeaveSubreddit() {
        this.subredditName = new String();
    }

    public static LeaveSubreddit byItsMainPage(){
        return instrumented(LeaveSubreddit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(LEAVE_SUBREDDIT_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(LEAVE_SUBREDDIT_BUTTON)

        );

        subredditName = SUBREDDIT_NAME.resolveFor(actor).getText();


    }


    public String getSubName() {
        return subredditName;
    }
}
