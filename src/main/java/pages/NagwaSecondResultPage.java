package pages;

import base.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class NagwaSecondResultPage extends page {

    //Buttons Locators from the prop file
    private final String worksheetSection = "nagwa.secondResult.worksheetSection.xpath";

    public NagwaSecondResultPage(WebDriver driver) throws IOException {
        super(driver);
    }

    public NagwaWorksheetPage clickOnWorksheetSection() throws IOException {
        elements.locators.getElementByXpath(worksheetSection,driver,prop).click();
        return new NagwaWorksheetPage(driver);
    }

    public void scrollTillWorksheetSection(){
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.locators.getElementByXpath(worksheetSection,driver,prop));
        actions.perform();
    }
}
