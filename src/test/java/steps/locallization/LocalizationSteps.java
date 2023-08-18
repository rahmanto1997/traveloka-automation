package steps.locallization;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.ThreadLocalDriver;
import pages.localization.LocalizationPages;

import java.io.IOException;

public class LocalizationSteps {
    public ThreadLocalDriver driver;
    private LocalizationPages lopa;

    @Given("^user on screen pick country and language$")
    public void userOnScreenPickCountryAndLanguage() {
        lopa = new LocalizationPages(driver);
        lopa.onScreenChooseCountryLanguage();
    }

    @When("^user choose location Indonesia$")
    public void userChooseLocationLanguageIndonesia() {
        lopa = new LocalizationPages(driver);
        lopa.chooseCountry();
    }

    @And("^user choose preferred Indonesia language$")
    public void userChoosePreferredIndonesialanguage() {
        lopa = new LocalizationPages(driver);
        lopa.chooseLanguage();
    }

    @Then("^user click button next$")
    public void userClickButtonLanjutkan() {
        lopa = new LocalizationPages(driver);
        lopa.clickButtonNext();
    }

    @And("^user click button join$")
    public void userClickButtonJoin() {
        lopa = new LocalizationPages(driver);
        lopa.clickJointButton();
        lopa.userClickBack();
    }

    @Given("^user on screen home$")
    public void userOnScreenHome() {
        lopa = new LocalizationPages(driver);
        lopa.onScreenHome();
    }

    @When("^user click flight menu$")
    public void userClickFlightMenu() {
        lopa = new LocalizationPages(driver);
        lopa.userClickFlight();
    }

    @And("^user choose from \"([^\"]*)\"$")
    public void userChooseFrom(String city) {
        lopa = new LocalizationPages(driver);
        lopa.userChooseFromDest(city);
    }

    @And("^user choose to \"([^\"]*)\"$")
    public void userChooseTo(String city2) {
        lopa = new LocalizationPages(driver);
        lopa.userChooseToDest(city2);
    }

    @Then("^user click button search$")
    public void userClickButtonSearch() {
        lopa = new LocalizationPages(driver);
        lopa.userClickBtnSearch();
        lopa.userClickToolTip();
    }

    @And("^user click from destination$")
    public void userClickFromDestination() {
        lopa = new LocalizationPages(driver);
        lopa.userClickFromDest();
    }

    @And("^user click to destination$")
    public void userClickToDestination() {
        lopa = new LocalizationPages(driver);
        lopa.userClickToDest();
    }

    @And("^user click roundtrip$")
    public void userClickRoundtrip() {
        lopa = new LocalizationPages(driver);
        lopa.userClickButtonRoundTrip();
    }

    @And("^user choose first class$")
    public void userChooseFirstClass() {
        lopa = new LocalizationPages(driver);
        lopa.userChooseFirstClass();
    }

    @And("^user click from destination Soetta$")
    public void userClickFromDestinationSoetta() {
        lopa = new LocalizationPages(driver);
        lopa.userClickFromDestSoetta();
    }

    @And("^user click to destination Padang$")
    public void userClickToDestinationPadang() {
        lopa = new LocalizationPages(driver);
        lopa.userClickToDestPdg();
    }

    @And("^user click nonroundtrip$")
    public void userClickNonroundtrip() {
        lopa = new LocalizationPages(driver);
        lopa.userClickButtonRoundTrip();
    }
}