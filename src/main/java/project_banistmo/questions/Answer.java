package project_banistmo.questions;

import cucumber.api.java.en_scouse.An;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import project_banistmo.UserInterface.SearchPDF;
import project_banistmo.model.PDFdata;

import java.util.List;

public class Answer implements Question<Boolean> {

private List<PDFdata> data;

    public Answer(List<PDFdata> data) {
        this.data = data;
    }

    public static Answer compare(List<PDFdata> data) {
        return new Answer(data);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String urlPDF = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        if (data.get(0).getStrurl().equals(urlPDF)){
            result = true;
        }
        else {
            result = false;
        }



        return result;
    }
}
