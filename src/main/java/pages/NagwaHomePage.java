package pages;

import base.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class NagwaHomePage extends page {

    //Buttons Locators from the prop file
    private final String searchIcon = "nagwa.home.searchBTN.xpath";
    private final String searchTextField = "nagwa.home.searchInputBTN.xpath";

    public NagwaHomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void clickOnSearchIcon(){
        elements.locators.getElementByXpath(searchIcon,driver,prop).click();
    }

    public NagwaResultsPage writeAndSearch(String data) throws IOException {
        elements.locators.getElementByXpath(searchTextField,driver,prop).sendKeys(data, Keys.ENTER);
        return new NagwaResultsPage(driver);
    }
}
