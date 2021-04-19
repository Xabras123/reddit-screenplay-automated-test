package userinterfaces.loginpage;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClassicLoginComponents {

    public static final Target USERNAME_INPUT = Target.the("Text input for the username credential").located(By.xpath("//input[@id='loginUsername']"));
    public static final Target PASSWORD_INPUT = Target.the("Text input for the password credential").located(By.id("loginPassword"));
    public static final Target LOGIN_BUTTON = Target.the("Button to make the login").located(By.id("AnimatedForm__submitButton m-full-width"));


}
