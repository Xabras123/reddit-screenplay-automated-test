package userinterfaces.globalcomponents.header.useractions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserActions {

    //USER_DROPDOWN_ID
    public static final Target PROFILE_OPTIONS_BUTTON = Target.the("Button to see the profile options").located(By.xpath("//button[@id='USER_DROPDOWN_ID']"));

}
