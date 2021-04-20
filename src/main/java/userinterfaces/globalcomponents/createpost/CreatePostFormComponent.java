package userinterfaces.globalcomponents.createpost;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePostFormComponent {

    public static final Target POST_TYPE_SELECTED_BUTTON = Target.the("Selected post type button").located(By.xpath("//button[@class='Z1w8VkpQ23E1Wdq_My3U4 j1Q89sB76i7EBRDhnQhlr']"));
    public static final Target POST_TYPE_UNSELECTED_BUTTONS = Target.the("Unselected post types buttons").located(By.xpath("(//button[@class='Z1w8VkpQ23E1Wdq_My3U4 '])[1]"));
    public static final Target CREATE_POST_BUTTON = Target.the("Button to create the post").located(By.xpath("//button[@class='_18Bo5Wuo3tMV-RDB8-kh8Z _2iuoyPiKHN3kfOoeIQalDT _10BQ7pjWbeYP63SAPNS8Ts HNozj_dKjQZ59ZsfEegz8 ']"));
    public static final Target NOTIFICATIONS_CHECKBOX = Target.the("Checkbox to disable/enable the notification options on the post").located(By.xpath("//div[@class='XZK-LTFT5CgGo9MvPQQsy rLLDF6zuY7gDPdOpDtryW _2BPowd18EKTnfZFrj5kY3G']"));

}
