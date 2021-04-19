package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.globalcomponents.posts.ActionsComponent.SAVE_POST_BUTTON;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT;
import static userinterfaces.loginpage.ClassicLoginComponents.PASSWORD_INPUT;
import static userinterfaces.loginpage.ClassicLoginComponents.USERNAME_INPUT;

public class SaveFeedPost implements Task {


    private int position;
    private String postTitle;

    public SaveFeedPost(int position) {
        this.position = position;
        this.postTitle = new String();
    }

    public static SaveFeedPost inPosition(int position){
        return instrumented(SaveFeedPost.class, position);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        //List<String> saveButtonList = Text.of(SAVE_POST_BUTTON).viewedBy(actor).asList();
        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(SAVE_POST_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(SAVE_POST_BUTTON)
        );

        postTitle = POST_TITLE_TEXT.resolveFor(actor).getText();


    }

    public String getPostTitle() {

        return postTitle;
    }
}
