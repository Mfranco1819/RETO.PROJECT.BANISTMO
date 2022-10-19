package project_banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import project_banistmo.UserInterface.SearchPDF;

public class Search implements Task {


    public static Search PDFfile() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchPDF.BUTTON_ABOUT_US),
                Click.on(SearchPDF.BUTTON_CORPORATE_INFORMATION),
                Click.on(SearchPDF.BUTTON_SUPPLIERS),
                Scroll.to(SearchPDF.BUTTON_DOWNLOAD_DOCUMENT),
                Click.on(SearchPDF.BUTTON_DOWNLOAD_DOCUMENT));




    }
}
