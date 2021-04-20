package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.SEARCH_BAR;
import static userinterfaces.globalcomponents.header.postsfilters.SearchComponent.SEARCH_SUGGESTIONS;

public class SearchInSearchBar implements Task {


    private String wordToSearch;

    public SearchInSearchBar(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public static SearchInSearchBar forWord(String word){
        return instrumented(SearchInSearchBar.class, word);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                Wait.until(  WebElementQuestion.the(SEARCH_BAR), isClickable()).forNoLongerThan(10).seconds(),
                Enter.theValue(wordToSearch).into(SEARCH_BAR),
                Click.on(SEARCH_BAR),
                Wait.until(  WebElementQuestion.the(SEARCH_SUGGESTIONS), isClickable()).forNoLongerThan(10).seconds(),
                Click.on(SEARCH_SUGGESTIONS)

        );



    }

}
