package userinterfaces.globalcomponents.createpost;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateImagePostBody {

    public static final Target POST_TITLE_INPUT = Target.the("Input for the new post title").located(By.xpath("//textarea[@class='PqYQ3WC15KaceZuKcFI02 _1ec_Oj5SWdypd8L-VELKg- ']"));
    public static final Target UPLOAD_IMAGE_BUTTON = Target.the("Button to upload the post image").located(By.xpath("//button[@class='_3O09Fh0CTb1KXH9g--pyTm _2iuoyPiKHN3kfOoeIQalDT _2tU8R9NTqhvBrhoNAXWWcP HNozj_dKjQZ59ZsfEegz8 ']"));
    public static final Target UPLOAD_IMAGE_INPUT = Target.the("Input for image path").located(By.xpath("//input[@class='sU2P34us34ODfjtvAFHEh']"));
}
