package tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.pages.components.FileToUpload;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tasks.joinsub.JoinSubreddit;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterfaces.globalcomponents.createpost.CreateImagePostBody.*;
import static userinterfaces.globalcomponents.createpost.CreatePostFormComponent.*;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.SEARCH_BAR;
import static userinterfaces.globalcomponents.subreddit.SubHeader.JOIN_SUBREDDIT_BUTTON;
import static userinterfaces.globalcomponents.subreddit.SubHeader.SUBREDDIT_NAME;
import static userinterfaces.profilepage.ProfileOptionsComponent.CREATE_NEW_POST_BUTTON;

public class CreatePersonalPost implements Task {



    private String postTitle;
    private String photoName;
    private WebDriver driver;
    //public static final String TEST_FILE = "src/main/resources/files/test.txt";
    private Path TEST_FILE_PATH;

    public CreatePersonalPost(String postTitle, String photoName, WebDriver driver) {
        this.postTitle = postTitle;
        this.photoName = photoName;
        TEST_FILE_PATH = Paths.get(photoName).toAbsolutePath();
        this.driver = driver;
    }

    public static CreatePersonalPost byItsMainPage(String postTitle, String photoName, WebDriver driver){
        return instrumented(CreatePersonalPost.class, postTitle, photoName, driver);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Path " + photoName);

        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(CREATE_NEW_POST_BUTTON), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(CREATE_NEW_POST_BUTTON),
                Wait.until(  WebElementQuestion.the(POST_TYPE_UNSELECTED_BUTTONS), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(POST_TYPE_UNSELECTED_BUTTONS),
                Click.on(NOTIFICATIONS_CHECKBOX),
                Enter.theValue(postTitle).into(POST_TITLE_INPUT)
                //Click.on(UPLOAD_IMAGE_BUTTON),
                //Wait.until(  WebElementQuestion.the(UPLOAD_IMAGE_INPUT), isEnabled()).forNoLongerThan(10).seconds(),
                //Enter.theValue(photoName).into(UPLOAD_IMAGE_INPUT)
                //Click.on(CREATE_POST_BUTTON)

                );

        UPLOAD_IMAGE_INPUT.resolveFor(actor).sendKeys(photoName);
        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(CREATE_POST_BUTTON), isEnabled()).forNoLongerThan(30).seconds(),
                Click.on(CREATE_POST_BUTTON)
        );



        //myUploadFile(driver);

    }


    private void myUploadFile(WebDriver driver){
        WebElement webElement = getUploadWebElementById("uploadfile_0", driver);
        FileToUpload fileToUpload = new FileToUpload(driver, photoName);
        fileToUpload.fromLocalMachine().to(webElement);
    }

    private static WebElement getUploadWebElementById(String id, WebDriver driver) {
        return driver.findElement(By.id(id));
    }
}
