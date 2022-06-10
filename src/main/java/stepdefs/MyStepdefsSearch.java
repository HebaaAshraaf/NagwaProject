package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

import java.io.IOException;

public class MyStepdefsSearch {

    protected WebDriver driver;

    //Pages
    private NagwaEntryPage nagwaEntryPage;
    private NagwaHomePage nagwaHomePage;
    private NagwaResultsPage nagwaResultsPage;
    private NagwaSecondResultPage nagwaSecondResultPage;
    private NagwaWorksheetPage nagwaWorksheetPage;

    @Before
    public void setup() throws Exception {
        //set path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        //create chrome instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public MyStepdefsSearch() {}

    @Given("The user opens Nagwa Website")
    public void TheuUserOpensNagwaWebsite() throws IOException {
        nagwaEntryPage = new NagwaEntryPage(driver);
    }

    @And("choose the English language")
    public void chooseTheEnglishLanguage() throws IOException {
        nagwaHomePage = nagwaEntryPage.clickOnEnglishButton();
    }

    @When("the user tries to search about {string}")
    public void theUserTriesToSearchAbout(String arg0) throws IOException {
        nagwaHomePage.clickOnSearchIcon();
        nagwaResultsPage = nagwaHomePage.writeAndSearch(arg0);
    }

    @And("the user chooses the second search result")
    public void theUserChoosesTheSecondSearchResult() throws IOException {
        nagwaSecondResultPage = nagwaResultsPage.clickOnSecondResult();
    }

    @And("the user go to the worksheet homepage")
    public void theUserGoToTheWorksheetHomepage() throws IOException {
        nagwaSecondResultPage.scrollTillWorksheetSection();
        nagwaWorksheetPage = nagwaSecondResultPage.clickOnWorksheetSection();
    }

    @Then("the Questions appears is {string}")
    public void theQuestionsAppearsIs(String arg0) {
         Assert.assertEquals(arg0,nagwaWorksheetPage.checkTheNumberOfTheQuestions());
    }
}
