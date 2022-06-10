package pages;

import base.page;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NagwaEntryPage extends page {

    //The path of url data in properties file
    private final String sauceURL = "nagwa.url";

    //Buttons Locators from the prop file
    private final String englishBTN = "nagwa.entry.englishBTN.xpath";

    public NagwaEntryPage(WebDriver driver) throws IOException {
        super(driver);
        driver.get(readers.PropReader.read(sauceURL, prop));
    }

    public NagwaHomePage clickOnEnglishButton() throws IOException {
        elements.locators.getElementByXpath(englishBTN,driver,prop).click();
        return new NagwaHomePage(driver);}
}
