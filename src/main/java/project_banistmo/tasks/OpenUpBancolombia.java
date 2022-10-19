package project_banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import project_banistmo.UserInterface.SearchPDF;

public class OpenUpBancolombia implements Task {


    public static OpenUpBancolombia website() {
        return Tasks.instrumented(OpenUpBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchPDF.BUTTON_BANCOLOMBIA_PAGE));

    }
}
