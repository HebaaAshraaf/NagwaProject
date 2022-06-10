package pages;

import base.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NagwaResultsPage extends page {

    //Buttons Locators from the prop file
    private final String secondResult = "nagwa.results.secondResult.xpath";

    public NagwaResultsPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public NagwaSecondResultPage clickOnSecondResult() throws IOException {
        elements.locators.getElementByXpath(secondResult,driver,prop).click();
        return new NagwaSecondResultPage(driver);
    }
}
