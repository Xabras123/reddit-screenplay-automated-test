package tasks.globaltasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_DROPDOWN;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.MY_COMMUNITIES_FILTER_INPUT;

public class SearchInPostFilter implements Task {


    private String wordToSearch;

    public SearchInPostFilter(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public static SearchInPostFilter forWord(String word) {
        return instrumented(SearchInPostFilter.class, word);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(MY_COMMUNITIES_DROPDOWN), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(MY_COMMUNITIES_DROPDOWN),
                Wait.until(WebElementQuestion.the(MY_COMMUNITIES_FILTER_INPUT), isClickable()).forNoLongerThan(10).seconds(),
                Enter.theValue(wordToSearch).into(MY_COMMUNITIES_FILTER_INPUT)

        );


    }

}
