package userinterfaces.globalcomponents.posts;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PostInfoComponent {

    public static final Target POST_TITLE_TEXT = Target.the("Title of the post").located(By.xpath("(//h3[@class='_eYtD2XCVieq6emjKBH3m'])[1]"));

}
