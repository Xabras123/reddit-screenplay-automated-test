package userinterfaces.profilepage;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProfileOptionsComponent {

    public static final Target EDIT_PROFILE_PICTURE_BUTTON = Target.the("Button to change the user profile picture").located(By.xpath("//div[@class='_3A5WTC_rfbijxxWBmIP4Yx _2PgeQeeIxIIadT5yPWlaTh']"));
    public static final Target CREATE_NEW_POST_BUTTON = Target.the("Button to create new post").located(By.xpath("//a[@class='_2q1wcTx60QKM_bQ1Maev7b _2iuoyPiKHN3kfOoeIQalDT _10BQ7pjWbeYP63SAPNS8Ts HNozj_dKjQZ59ZsfEegz8 ']"));

}
