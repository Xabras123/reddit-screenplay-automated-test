package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.globalcomponents.header.useractions.ProfileOptions.SEE_PROFILE_BUTTON;
import static userinterfaces.globalcomponents.header.useractions.UserActions.PROFILE_OPTIONS_BUTTON;
import static userinterfaces.profilepage.UserActivity.ACTIVITY_TYPES_BUTTON;

public class EntersActivityPosts implements Task {


    private int position;

    public EntersActivityPosts(int position) {
        this.position = position;
    }

    public static EntersActivityPosts inPosition(int position){
        return instrumented(EntersActivityPosts.class, position);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PROFILE_OPTIONS_BUTTON),
                Click.on(SEE_PROFILE_BUTTON),
                Click.on(ACTIVITY_TYPES_BUTTON)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
