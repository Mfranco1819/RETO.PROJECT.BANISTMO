package project_banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import project_banistmo.UserInterface.BanistmoPage;

public class Openup implements Task {

private BanistmoPage banistmoPage;

    public static Openup thePage() {
        return Tasks.instrumented(Openup.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(banistmoPage));


    }
}
