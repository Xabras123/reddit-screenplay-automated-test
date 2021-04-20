package userinterfaces.globalcomponents.subreddit;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubHeader {

    public static final Target SUBREDDIT_TITLE = Target.the("Title of the subreddit page").located(By.xpath("//h1[@class='_2yYPPW47QxD4lFQTKpfpLQ']"));
    public static final Target SUBREDDIT_NAME = Target.the("Name of the subreddit").located(By.xpath("//h2[@class='_33aRtz9JtW0dIrBNKFAl0y']"));
    public static final Target JOIN_SUBREDDIT_BUTTON = Target.the("Button to join sub").located(By.xpath(  "//button[@class='_1LHxa-yaHJwrPK8kuyv_Y4 _2iuoyPiKHN3kfOoeIQalDT _10BQ7pjWbeYP63SAPNS8Ts HNozj_dKjQZ59ZsfEegz8 ']"));
    public static final Target LEAVE_SUBREDDIT_BUTTON = Target.the("Button to leave sub").located(By.xpath("//button[@class='_1LHxa-yaHJwrPK8kuyv_Y4 _2iuoyPiKHN3kfOoeIQalDT _2tU8R9NTqhvBrhoNAXWWcP HNozj_dKjQZ59ZsfEegz8 ']"));

}
