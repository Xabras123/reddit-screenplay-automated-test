package tasks.globaltasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_DROPDOWN;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_FILTER_INPUT;
import static userinterfaces.loginpage.ClassicLoginComponents.*;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login withCredentials(String username, String password){
        return instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                //Click.on(Header.LOGIN_BUTTON),
                Enter.theValue(username).into(USERNAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT).thenHit(Keys.ENTER)
                //Click.on(LOGIN_BUTTON)
        );



    }

}
