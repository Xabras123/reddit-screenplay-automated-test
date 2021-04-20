package userinterfaces.globalcomponents.header.postsfilters;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchComponent {

    public static final Target SEARCH_BAR = Target.the("search bar").located(By.xpath("//input[@id='header-search-bar']"));
    public static final Target SEARCH_SUGGESTIONS = Target.the("search suggestions").located(By.xpath("(//a[@class='_20OHBqoDD71_8fv7tuG6u6 _3NseKdP3_1HONmKk_kK3_l XEkFoehJNxIH9Wlr5Ilzd '])[1]"));
    //public static final Target SEARCH_SUGGESTIONS = Target.the("search suggestions").located(By.xpath("(//span[@class='_2aqH0n-kSzFY7HZZ5GL-Jb'])[1]"));

    public static final Target MY_COMMUNITIES_DROPDOWN = Target.the("search suggestions").located(By.xpath("//button[@class='h-jI8r2f9ozTNqu_2TBeY']"));
    public static final Target MY_COMMUNITIES_FILTER_INPUT = Target.the("search suggestions").located(By.xpath("//input[@class='_37tmRmxaFMjRRrvwcY2JmY']"));

    public static final Target MY_COMMUNITIES_OPTIONS_BUTTONS = Target.the("search suggestions").located(By.xpath("(//a[@class='XEkFoehJNxIH9Wlr5Ilzd _2MgAHlPDdKvXiG-Qbz5cbC _3Av66iQf7_N4Z-XZxsek76'])[1]"));


}
