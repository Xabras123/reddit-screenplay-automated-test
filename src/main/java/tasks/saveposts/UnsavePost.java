package tasks.saveposts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.posts.ActionsComponent.SAVE_POST_BUTTON;
import static userinterfaces.globalcomponents.posts.PostInfoComponent.POST_TITLE_TEXT;

public class UnsavePost implements Task {


    private int position;
    private String postTitle;

    public UnsavePost(int position) {
        this.position = position;
        this.postTitle = new String();
    }

    public static UnsavePost inPosition(int position){
        return instrumented(UnsavePost.class, position);
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

    public static class SaveFeedPost implements Task {


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
}
