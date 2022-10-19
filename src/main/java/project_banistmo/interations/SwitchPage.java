package project_banistmo.interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchPage implements Interaction {


    public static SwitchPage website() {
        return new SwitchPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindows = driver.getWindowHandles();
        for (String currentWindow : theWindows){
            driver.switchTo().window(currentWindow);
        }

    }
}
