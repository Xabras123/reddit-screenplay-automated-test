package tasks.globaltasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_DROPDOWN;
import static userinterfaces.globalcomponents.header.useractions.ProfileOptions.SEE_PROFILE_BUTTON;
import static userinterfaces.globalcomponents.header.useractions.UserActions.PROFILE_OPTIONS_BUTTON;
import static userinterfaces.profilepage.UserActivityComponent.ACTIVITY_TYPES_BUTTON;

public class EnterProfilePage implements Task {



    public EnterProfilePage() {

    }

    public static EnterProfilePage fromMainPage(){
        return instrumented(EnterProfilePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(PROFILE_OPTIONS_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(PROFILE_OPTIONS_BUTTON),
                Wait.until(WebElementQuestion.the(SEE_PROFILE_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(SEE_PROFILE_BUTTON)
        );



    }
}
