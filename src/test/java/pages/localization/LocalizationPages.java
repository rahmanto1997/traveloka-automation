package pages.localization;

import driver.ThreadLocalDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import pages.BasePage;
import utils.WaitUtils;

public class LocalizationPages extends BasePage{
    public LocalizationPages(ThreadLocalDriver driver){
        super(driver);
    }

    public static WaitUtils wait = new WaitUtils();

    @AndroidFindBy(id = "on_board_title")
    AndroidElement onBoardingTitle;
    @AndroidFindBy(id = "on_board_description")
    AndroidElement onBoardingDesc;
    @AndroidFindBy(id = "input_country")
    AndroidElement fieldCuntry;
    @AndroidFindBy(id = "input_language")
    AndroidElement fieldLanguage;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your Preferred Country']")
    AndroidElement tryTitle;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Indonesia']")
    AndroidElement chooseIndonesia;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Your Preferred Language']")
    AndroidElement tryTitle2;
    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'Lanjutkan']")
    AndroidElement nextButton;
    @AndroidFindBy(id = "buttonJoin")
    AndroidElement joinBtn;
    @AndroidFindBy(id = "button_tooltip")
    AndroidElement toolTip;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Tiket Pesawat']")
    AndroidElement flightTicket;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Pesawat']")
    AndroidElement flightText;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Jakarta (JKTA)']")
    AndroidElement fieldFromDest;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Jakarta (CGK)']")
    AndroidElement fieldFromDestSoetta;
    @AndroidFindBy(id = "edit_text_field")
    AndroidElement fieldSearchCity;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Jakarta, Indonesia']")
    AndroidElement cityJakarta;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Bali / Denpasar (DPS)']")
    AndroidElement fieldToDest;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Padang (PDG)']")
    AndroidElement fieldToDestPdg;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Padang, Indonesia']")
    AndroidElement cityPadang;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='flight_searchform_button_search']")
    AndroidElement btnSearchFlight;
    @AndroidFindBy(xpath = "//android.widget.Switch[@content-desc='flight_searchform_button_roundtrip']")
    AndroidElement btnRoundTrip;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Economy']")
    AndroidElement fieldFlightClass;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Kelas Penerbangan']")
    AndroidElement labelFlightClass;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'First Class']")
    AndroidElement firstClass;
    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'SELESAI']")
    AndroidElement btnDoneFlightClass;

    public void onScreenChooseCountryLanguage()  {
        wait.staticWait(1000);
        Assert.assertEquals(onBoardingTitle.getText(), "Halo! Selamat datang di Traveloka.");
        Assert.assertEquals(onBoardingDesc.getText(), "To continue, pick your country and language.");
    }

    public void chooseCountry(){
        fieldCuntry.click();
        wait.waitForElementToBeVisibleAndroid(tryTitle, ThreadLocalDriver.getTLDriver(), 500);
        chooseIndonesia.click();
    }

    public void chooseLanguage(){
        fieldLanguage.click();
        wait.waitForElementToBeVisibleAndroid(tryTitle2, ThreadLocalDriver.getTLDriver(), 500);
        chooseIndonesia.click();
    }

    public void clickButtonNext(){
        nextButton.click();
    }

    public void clickJointButton(){
        joinBtn.click();
    }

    public void userClickBack(){
        ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        toolTip.click();
    }

    public void onScreenHome(){
        Assert.assertTrue(flightTicket.isDisplayed());
    }
    public void userClickFlight(){
        flightTicket.click();
        wait.waitForElementToBeVisibleAndroid(flightText, ThreadLocalDriver.getTLDriver(), 500);
        wait.staticWait(1000);
    }

    public void userClickFromDest(){
        Assert.assertTrue(fieldFromDest.isDisplayed());
        fieldFromDest.click();
    }

    public void userClickFromDestSoetta(){
        Assert.assertTrue(fieldFromDestSoetta.isDisplayed());
        fieldFromDestSoetta.click();
    }

    public void userChooseFromDest(String city){
        fieldSearchCity.sendKeys(city);
        cityJakarta.click();
    }

    public void userClickToDest(){
        Assert.assertTrue(fieldToDest.isDisplayed());
        fieldToDest.click();
    }

    public void userClickToDestPdg(){
        Assert.assertTrue(fieldToDestPdg.isDisplayed());
        fieldToDestPdg.click();
    }

    public void userChooseToDest(String city2){
        fieldSearchCity.sendKeys(city2);
        cityPadang.click();
        wait.waitForElementToBeVisibleAndroid(btnSearchFlight, ThreadLocalDriver.getTLDriver(), 500);
    }

    public void userClickButtonRoundTrip(){
        Assert.assertTrue(btnRoundTrip.isDisplayed());
        btnRoundTrip.click();
    }

    public void userChooseFirstClass(){
        Assert.assertTrue(fieldFlightClass.isDisplayed());
        fieldFlightClass.click();
        wait.waitForElementToBeVisibleAndroid(labelFlightClass, ThreadLocalDriver.getTLDriver(), 500);
        firstClass.click();
        btnDoneFlightClass.click();
        wait.waitForElementToBeVisibleAndroid(btnSearchFlight, ThreadLocalDriver.getTLDriver(), 500);
    }

    public void userClickBtnSearch(){
        btnSearchFlight.click();
    }

    public void userClickToolTip(){
        try {
            Assert.assertTrue(toolTip.isDisplayed());
            System.out.println("Pop Up Display");
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        } catch (Exception e) {
            System.out.println("Pop Up Not Display");
            ThreadLocalDriver.getTLDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        }
    }
}
