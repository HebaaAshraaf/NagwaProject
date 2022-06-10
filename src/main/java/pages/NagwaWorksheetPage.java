package pages;

import base.page;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NagwaWorksheetPage extends page {

    //Buttons Locators from the prop file
    private final String numberOfQuestions = "nagwa.worksheet.q";

    public NagwaWorksheetPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public String checkTheNumberOfTheQuestions(){
        return Integer.toString(elements.locators.getElementsByXpath(numberOfQuestions,driver,prop).size());
    }
}
