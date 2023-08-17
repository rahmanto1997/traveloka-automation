package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.ThreadLocalDriver;
import pages.LocalizationPages;

import java.io.IOException;

public class LocalizationSteps {
    public ThreadLocalDriver driver;
    private LocalizationPages localizationPages;

    @Given("^user on screen pick country and language$")
    public void userOnScreenPickCountryAndLanguage() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.onScreenChooseCountryLanguage();
    }

    @When("^user choose location Indonesia$")
    public void userChooseLocationLanguageIndonesia() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.chooseCountry();
    }

    @And("^user choose preferred Indonesia language$")
    public void userChoosePreferredIndonesialanguage() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.chooseLanguage();
    }

    @Then("^user click button next$")
    public void userClickButtonLanjutkan() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.clickButtonNext();
    }

    @And("^user click button join$")
    public void userClickButtonJoin() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.clickJointButton();
        localizationPages.userClickBack();
    }

    @Given("^user on screen home$")
    public void userOnScreenHome() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.onScreenHome();
    }

    @When("^user click flight menu$")
    public void userClickFlightMenu() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.userClickFlight();
    }

    @And("^user choose from \"([^\"]*)\"$")
    public void userChooseFrom(String city) {
        localizationPages = new LocalizationPages(driver);
        localizationPages.userChooseFromDest(city);
    }

    @And("^user choose to \"([^\"]*)\"$")
    public void userChooseTo(String city2) {
        localizationPages = new LocalizationPages(driver);
        localizationPages.userChooseToDest(city2);
    }

    @Then("^user click button search$")
    public void userClickButtonSearch() {
        localizationPages = new LocalizationPages(driver);
        localizationPages.userClickBtnSearch();
    }
}