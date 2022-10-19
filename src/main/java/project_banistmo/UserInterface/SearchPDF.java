package project_banistmo.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPDF extends PageObject {

    public static final Target BUTTON_BANCOLOMBIA_PAGE = Target.the("button shows the next window")
            .located(By.xpath("//*/div/div[2]/div/div[4]/section/div[3]/section/div/div/div/div[1]/a/span"));

    public static final Target BUTTON_ABOUT_US = Target.the("button shows more information about the page")
            .located(By.id("header-nosotros"));

    public static final Target BUTTON_CORPORATE_INFORMATION = Target.the("Option are displayed").located(By.xpath("//*[@id=\"serv\"]"));

    public static final Target BUTTON_SUPPLIERS = Target.the("Display suppliers information")
            .located(By.xpath("//*/div/div/div/div/div/div[6]/div/a"));

    public static final Target BUTTON_DOWNLOAD_DOCUMENT = Target.the("show the PDF file")
            .located(By.xpath("//*/div/div[3]/div/div[1]/div/p[2]/a"));

    public static final Target VALIDATION_DOCUMENT = Target.the("Validation successful")
            .located(By.xpath("//*[@id=\"title\"]/text()"));





}
