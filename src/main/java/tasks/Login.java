package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.homepage.Header;

import static net.serenitybdd.screenplay.Tasks.instrumented;
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
