package project_banistmo.StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import project_banistmo.interations.SwitchPage;
import project_banistmo.model.PDFdata;
import project_banistmo.questions.Answer;
import project_banistmo.tasks.OpenUpBancolombia;
import project_banistmo.tasks.Openup;
import project_banistmo.tasks.Search;

import java.util.List;

public class BanistmoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^The user wants to download PDF file from the page Banistmo$")
    public void theUserWantsToDownloadPDFFileFromThePageBanistmo() {
        OnStage.theActorCalled("Maikel").wasAbleTo(Openup.thePage(), OpenUpBancolombia.website(), SwitchPage.website());


    }

    @When("^the user seach the document$")
    public void theUserSeachTheDocument() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.PDFfile(),SwitchPage.website());

    }

    @Then("^the document validation is successful$")
    public void theDocumentValidationIsSuccessful(List<PDFdata> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.compare(data)));



    }


}
